package com.renova.patterns.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renova.patterns.observer.Ogrenci;
import com.renova.patterns.observer.Ogretmen;
import com.renova.patterns.observer.ZilCalmaObservable;

class ObserverTest {

	@Test
	void test() {
		
		/* oneToMany iliskisi acisindan ogrencilerin scoplelarý prototype
		 * ogretmenlerin scoplarý ise singleton olarak belirlendi, cunu bu 
		 * senaryoda bir ogretmen bir sýnýf ogrencýnýn dersine girmektedir.*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		System.out.println(context);
		
		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		Ogretmen ogretmen = context.getBean(Ogretmen.class);
		
		ZilCalmaObservable zilCalmaObservable = context.getBean(ZilCalmaObservable.class);
		
		ogretmen.setObservable(zilCalmaObservable);			
		
		zilCalmaObservable.addObserver(ogretmen);
		zilCalmaObservable.addObserver(context.getBean(Ogretmen.class));  //IKI FARKLI OGRETMEN BEAN LISTEYE EKLENIR
		
		zilCalmaObservable.addObserver(ogrenci);
		zilCalmaObservable.addObserver(context.getBean(Ogrenci.class));  //IKI FARKLI OGRENCI BEAN LISTEYE EKLENIR
		
		zilCalmaObservable.zilCalmaObserver(); // ZIL CALDIGI BILDIRIMI GONDERILIR VE EKRANA YAZDIRILIR
		
		
	}

}
