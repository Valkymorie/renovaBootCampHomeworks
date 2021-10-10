package com.renova.patterns.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.renova.patterns.facade.Facade;
import com.renova.patterns.facade.Ogrenci;

class FacadeTest {

	@Test
	void test() {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Facade facade = context.getBean(Facade.class);
		Ogrenci ogrenci = context.getBean("ogrenci", Ogrenci.class);

		//ISTEKLER CAGIRILIYOR
		facade.matematikOdev(ogrenci);
		facade.fenOdev(ogrenci);
		facade.turkceOdev(ogrenci);
		facade.muzikOdev(ogrenci);

	}

}
