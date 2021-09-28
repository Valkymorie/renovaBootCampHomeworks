package com.renova.patterns.state;

public class OgrenciEatState implements OgrenciState{  //OGRENCI YEMEK YERKEN CALISACAK METHODLAR

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci yemegini bitirip ders calismaya basladi");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci yemegini bitirip uyumaya basladi.");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci zaten yemek yiyor.");
		
	}
	

}
