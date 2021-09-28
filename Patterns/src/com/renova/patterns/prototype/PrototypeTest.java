package com.renova.patterns.prototype;

public class PrototypeTest  {
	

	public static void main(String[] args) throws CloneNotSupportedException {
				 
		// LISKOV SUBSTITUON
		
		Freshman freshman = new Freshman();
		freshman.setName("emir");
		Sophomore sophomore = new Sophomore();
		sophomore.setName("taha");
		
		Ogrenci clonedFreshman = freshman.clone();  	// Freshman clonedFreshman = (Freshman)freshman.clone();
		System.out.println("Ogrenci: "+ clonedFreshman.getYear());
		clonedFreshman.info(); //OGRENCI SOYUT SINIFINDAN REFERANS GOSTERILMIS FRESHMAN NESNESI OLAN clonedFreshman BILGILERI
		System.out.println("Ogrenci adi: "+ clonedFreshman.getName());
		
		System.out.println();
		
		Ogrenci clonedSophomore = sophomore.clone(); 	// Sophomore clonedSophomore = (Sophomore)sophomore.clone();
		System.out.println("Ogrenci: "+ clonedSophomore.getYear());
		clonedSophomore.info(); //OGRENCI SOYUT SINIFINDAN REFERANS GOSTERILMIS SOPHOMORE NESNESI OLAN clonedSophomore BILGILERI
		System.out.println("Ogrenci adi: "+ clonedSophomore.getName());
		
		System.out.println();
		
		System.out.println(freshman == clonedFreshman);  //FARKLI NESNELER, FARKLI REFERANS ADRESLERI
		System.out.println(sophomore == clonedSophomore);
	}
	
}
