package com.renova.patterns.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Ogretmen implements Observer {  // SOMUT GOZLEMCI

	@Autowired private Observable observable;

	public void setObservable(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void zilCal(String message) {
		System.out.println(message + " Ogretmen derse gidiyor.");
	}

	public void removeObserver() {
		observable.removeObserver(this);
	}

}
