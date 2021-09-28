package com.renova.patterns.state;

public class StateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SINGLE RESPONSIBILITY
		
		Ogrenci ogrenci = new Ogrenci();
		
		//DURUMU UYUYOR OLARAK OLUSAN OGRENCI NESNESININ STATE DURUMU SINIF ISMINDEN DE GORULEBILIR
		System.out.println("Ogrencinin baslangic durumu: "+ ogrenci.getOgrenciState().getClass().getSimpleName()); 
		
		ogrenci.sleep();
		System.out.println();
		ogrenci.work();
		System.out.println();
		ogrenci.eat();
		
		
		System.out.println();
		System.out.println("-----");
		System.out.println();
	
		System.out.println("Ogrencinin durumu: "+ ogrenci.getOgrenciState().getClass().getSimpleName());
		
		ogrenci.eat();
		System.out.println();
		ogrenci.work();
		System.out.println();
		ogrenci.sleep();
		
		//System.out.println("Ogrencinin son durumu: "+ ogrenci.getOgrenciState().getClass().getSimpleName());
	}

}
