package com.renova.patterns.prototype;

public class Freshman extends Ogrenci{
	
	//KOPYALANMASI ISTENILEN GERCEK NESNE SINIFIDIR, SOYUT PROTOTYPE OGRENCI SINIFINI CLONELAMA OZELLIGI ICIN EXTENDS EDER

	public  Freshman() { //NESNE OLUSTUGUNDA year DEGISKENI DEFAULT OLARAK BULUNUR
		// TODO Auto-generated constructor stub
		year = "Freshman";
	}
	
	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("Ogrenci 1. yilinda");

	}

}
