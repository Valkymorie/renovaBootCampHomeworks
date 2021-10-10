package com.renova.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ZilCalmaObservable implements Observable { // GOZLEMCI ARAYUZUN SOMUT GOZLEMCILER ICIN OZELLESTIRILMESI

	/*Eger liste autowired yapilsaydi beanler olusurken icine sirasi ile
	 * bir ogrenci ve bir ogretmen bean eklenerek runtimeda calismaya baslanirdi*/
	private List<Observer> observerList = new ArrayList<>(); 
	private String message = "Zil Caldi";

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void zilCalmaObserver() {  // ZIL CALDIGINI GOZLEMCILERE GONDERMEK ICIN METHOD
		
		for (Observer observer : observerList) {
			observer.zilCal(message+ " "+ observer.hashCode()); // GELEN NESNELERIN ADRESLERINI GONDEREMEDIGIM ICIN HASH CODE ILE FARKLI MEMORYLERDE TUTULMALARI GOZLEMLENIR
		}
	}

}
