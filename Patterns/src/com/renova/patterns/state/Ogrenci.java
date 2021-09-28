package com.renova.patterns.state;

public class Ogrenci {
	
	private OgrenciState ogrenciState; //OGRENCI DURUMUNU TUTAN REFERANS
	
	
	
	public void setOgrenciState(OgrenciState ogrenciState) {
		this.ogrenciState = ogrenciState;
	}


	public OgrenciState getOgrenciState() {
		return ogrenciState;
	}


	public Ogrenci() {		
		setOgrenciState(new OgrenciSleepState());  //OGRENCI NESNESI OLUSURKEN DURUMU DEFAULT OLARAK UYUYOR OLARAK OLUSTURULUR
	}
	
	public void work() {  // ogrenci.work() METHODU CAGIRILDIGINDA CALISAN METHOD
		
		ogrenciState.work();
		if(ogrenciState instanceof OgrenciSleepState) {  // STATE DEGISTIGINDE CALISAN KISIM
			
			setOgrenciState(new OgrenciWorkState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName()); 
		}else if(ogrenciState instanceof OgrenciEatState) { // STATE DEGISTIGINDE CALISAN KISIM
			
			setOgrenciState(new OgrenciWorkState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName()); 
		}
	}
	
	
	public void sleep() {  // ogrenci.sleep() METHODU CAGIRILDIGINDA CALISAN METHOD
		
		ogrenciState.sleep();
		if(ogrenciState instanceof OgrenciWorkState) {  // STATE DEGISTIGINDE CALISAN KISIM
			
			setOgrenciState(new OgrenciSleepState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName());  
		}else if (ogrenciState instanceof OgrenciEatState) {
			
			setOgrenciState(new OgrenciSleepState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName()); 
		}
	}
	
	public void eat() {  // ogrenci.eat() METHODU CAGIRILDIGINDA CALISAN METHOD
		
		ogrenciState.eat();
		if(ogrenciState instanceof OgrenciWorkState) {
			
			setOgrenciState(new OgrenciEatState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName()); 
		}else if (ogrenciState instanceof OgrenciSleepState) {
			
			setOgrenciState(new OgrenciEatState());
			System.out.println("Ogrencinin durumu: "+ ogrenciState.getClass().getSimpleName()); 
		}
		
	}
	

}
