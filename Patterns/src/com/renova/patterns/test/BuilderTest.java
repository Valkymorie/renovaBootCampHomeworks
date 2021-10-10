package com.renova.patterns.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renova.patterns.builder.Ogrenci;
import com.renova.patterns.builder.OgrenciFactoryBean;

class BuilderTest {

	@Test
	void test() throws Exception {
		
		/* builder pattern spring ile iki farkli sekilde yapilabilmektedir.
		 * 1. yol kod uzerinden ozellestirilmis factoryBean sinifina buider methodlarini gondermektir,
		 * 2. yol ise xml konfigurasyonu ile bir facktoryBean icin builder bean ve bir tane daha
		 * build edilecek nesne icin bean olusturulur*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		/*OgrenciFactoryBean ogrenciFactoryBean = context.getBean("ogrenciFactoryBean", OgrenciFactoryBean.class); // ILK YOL KULLANILIRSA YAZILMA SEKLI
		Ogrenci student = ogrenciFactoryBean.getObject();
		System.out.println("Ogrenci adi: "+student.getAd()+" \n"
				+ "Ogrenci soyadi: "+student.getSoyAd()+" \n"
				+ "Ogrenci numarasi: "+student.getNumara()+" \n"
				+ "Ogrenci sinifi: "+student.getSinif()+" \n"
				+ "Ogrenci okulu: "+student.getOkul()+" \n");*/
		
		Ogrenci ogrenci = context.getBean("ogrenciBuild", Ogrenci.class);  //XML KONFIGURASYONUNDAN OLUSAN BEAN KULLANILIR
		
		System.out.println("Ogrenci adi: "+ogrenci.getAd()+" \n"
				+ "Ogrenci soyadi: "+ogrenci.getSoyAd()+" \n"
				+ "Ogrenci numarasi: "+ogrenci.getNumara()+" \n"
				+ "Ogrenci sinifi: "+ogrenci.getSinif()+" \n"
				+ "Ogrenci okulu: "+ogrenci.getOkul()+" \n");
	}

}
