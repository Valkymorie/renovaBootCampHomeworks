package com.renova.patterns.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ogrenci implements Observer { // SOMUT GOZLEMCI

	@Autowired private Observable observable;

	@Override
	public void zilCal(String message) {
		System.out.println(message + " Ogrenci derse gidiyor.");
	}

	public void removeObserver() {
		observable.removeObserver(this);
	}

}
