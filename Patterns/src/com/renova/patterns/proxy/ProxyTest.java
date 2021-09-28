package com.renova.patterns.proxy;

public class ProxyTest {

	
	public static void main(String[] args) {
		
		//DEPENDENCY INVERSION
		
		IOgrenci ogrenci = new ProxyOgrenci("emir", 1);  //GERCEK NESNE OLUSMADAN PROXY OGRENCIDE DATA TUTULMAKTADIR 
		
		ogrenci.info();  //NESNEYE ULAÞIRKEN KONTROLLER YAPILIR
		
		System.out.println();
		
		ogrenci.info();  // KONTROLU YAPILMIÞ VE OLUÞMUÞ NESNE METHOD TEKRAR CAGIRILIR
	}
}
