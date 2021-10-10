package com.renova.patterns.observer;

import org.springframework.stereotype.Repository;

@Repository
public interface Observer {  // DEGISIMLERI SINIFA GORE BILDIREN METHODUN BULUNDUGU ARAYUZ

	void zilCal(String message);
}
