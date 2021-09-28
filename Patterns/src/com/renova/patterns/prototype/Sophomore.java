package com.renova.patterns.prototype;

public class Sophomore extends Ogrenci{
	
	//KOPYALANMASI ISTENILEN GERCEK NESNE SINIFIDIR, SOYUT PROTOTYPE OGRENCI SINIFINI CLONELAMA OZELLIGI ICIN EXTENDS EDER
	
	public  Sophomore() { //NESNE OLUSTUGUNDA year DEGISKENI DEFAULT OLARAK BULUNUR
		// TODO Auto-generated constructor stub
		year = "Sophomore";
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci 2. yilinda");
	}

}
