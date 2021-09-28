package com.renova.patterns.proxy;

public class ProxyTest {

	
	public static void main(String[] args) {
		
		//DEPENDENCY INVERSION
		
		IOgrenci ogrenci = new ProxyOgrenci("emir", 1);  //GERCEK NESNE OLUSMADAN PROXY OGRENCIDE DATA TUTULMAKTADIR 
		
		ogrenci.info();  //NESNEYE ULA�IRKEN KONTROLLER YAPILIR
		
		System.out.println();
		
		ogrenci.info();  // KONTROLU YAPILMI� VE OLU�MU� NESNE METHOD TEKRAR CAGIRILIR
	}
}
