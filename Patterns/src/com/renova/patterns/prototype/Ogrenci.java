package com.renova.patterns.prototype;

public abstract class Ogrenci implements IOgrenciCloneable{
	
	 // CLONELAMA ISLEMI ICIN NESNELERE TEMEL DEGISKEN BULUNDURAN VE CLONELAMA METHODU BULUNDURAN SOYUT SINIF
	
	protected String year;
	protected String name;
	
	public abstract void info();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public String getYear() {
		return year;
	}


	@Override
	public Ogrenci clone() throws CloneNotSupportedException{  //CLONELAMA METHODU
		
			return (Ogrenci) super.clone();	
	}
	
	
	
}
