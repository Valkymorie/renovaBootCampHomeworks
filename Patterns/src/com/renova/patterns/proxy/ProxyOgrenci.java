package com.renova.patterns.proxy;

public class ProxyOgrenci implements IOgrenci{

	private Ogrenci ogrenci;  //GERCEK OGRENCI SINIF REFERANSI
	private int id;
	private String name;
	
	 public ProxyOgrenci(String name, int id) { // PROXY OGRENCI NESNESI CONS
		// TODO Auto-generated constructor stub
		 this.name= name;
		 this.id= id;
	}
	
	
	@Override
	public void info() {  // ARAYUZDEN ALINAN PROXY VE GERCE OGRENCI SINIFINDA OLAN METHOD
		// TODO Auto-generated method stub
		
		if(ogrenci == null) {  //OGRENCI REFERANSINA GERCEK OGRENCI NESNESI ATANDI MI YA DA CONSTRUCTOR DAHA ONCEDEN CALISTI MI DIYE KONTROL EDER
			ogrenci = new Ogrenci(name, id);
		}		
		ogrenci.info();
	}

}
