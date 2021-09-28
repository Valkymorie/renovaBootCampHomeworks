package com.renova.patterns.state;

public class OgrenciWorkState implements OgrenciState{  //OGRENCI CALISIR DURUMUNDAYKEN CALISACAK METHODLAR

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci zaten calisiyor.");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci ders calismayi birakip uyumaya basladi.");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci ders calismayi birakip yemek yemeye basladi.");
		
	}	

}
