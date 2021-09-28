package com.renova.patterns.proxy;

public class Ogrenci implements IOgrenci{
	
	private String name;
	private int id;
	
	public Ogrenci(String name, int id) { // OGRENCI NESNESI CONSTRUCTOR  
		this.name = name;
		this.id = id;
		controlOgrenci(id);
	}
	
	@Override
	public void info() { //OGRENCI NESNESI BILGILERINI YAZDIRAN METHOD
		// TODO Auto-generated method stub
		System.out.println("Ogrenci adi: " + name+" \n"
							+ "Ogrenci id: " + id);
		
	}
	
	private void controlOgrenci(int id) {  // CONSTRUCTOR ICINDE CAGIRILAN METHOD
		System.out.println("Ilk kez verilen ogrenci id: "+ id);
	}

}
