package com.renova.patterns.builder;

import org.springframework.beans.factory.FactoryBean;

public class OgrenciFactoryBean { // implements FactoryBean<Ogrenci> YAZILARAK KOD ILE KONFIGURASYON YAPILABILIR, XML ILE KONFIGURASYON YAPILIRKEN BU SINIF KULLANILMAMAKTADIR

	/*@Override
	public Ogrenci getObject() throws Exception {
		
		return null;Ogrenci.Builder()
					.ad("emir")
					.soyAd("Alay")
					.numara("1")
					.sinif("senior")
					.okul("KOU")
					.build();						
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Ogrenci.class;
	}*/

}
