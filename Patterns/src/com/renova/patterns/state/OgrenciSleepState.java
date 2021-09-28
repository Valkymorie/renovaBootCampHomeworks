package com.renova.patterns.state;

public class OgrenciSleepState implements OgrenciState{  //OGRENCI UYURKEN CALISACAK METHODLAR

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci uykusundan uyanip ders calismaya basliyor.");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci zaten uyuyor.");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci uykusundan uyanip yemek yemeye basliyor.");
		
	}

}
