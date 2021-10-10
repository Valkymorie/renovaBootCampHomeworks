package com.renova.patterns.observer;

import org.springframework.stereotype.Service;

@Service
public interface Observable { // GOZLEYICI ARAYUZ 

	void addObserver(Observer observer);

	void removeObserver(Observer observer);

	void zilCalmaObserver();

}
