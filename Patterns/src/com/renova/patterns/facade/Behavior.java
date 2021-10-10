package com.renova.patterns.facade;

import org.springframework.stereotype.Service;

/*main method kullanmadigim icin source dosya adi ile ayni public class kullanmadim.
 * somut nesne sinifi tarafindan istenilen istekleri karsilayan siniflar ve yaptiklari isler.
 * facade tarafindan cagirilan methodlar burada olusmaktadir.
 * 
 * bu methodlar birbirine benziyor gibi gorunse de facade pattern kullanilirken amac,
 * farkli siniflardan farkli islerin tek bir arayuz uzerinden kontrol edilmesini saglamaktir.
 * */

@Service
class Matematik {

	public void matematikOdeviniYap(Ogrenci ogrenci) {
		System.out.println(
				ogrenci.getMatematikOdev() + " sorusunu " + this.getClass().getSimpleName() + " kullanarak yapti");
	}
}

@Service
class Turkce {

	public void turkceOdeviniYap(Ogrenci ogrenci) {
		System.out.println(
				ogrenci.getTurkceOdev() + " sorusunu " + this.getClass().getSimpleName() + " kullanarak yapti");
	}
}

@Service
class Fen {

	public void fenOdeviniYap(Ogrenci ogrenci) {
		System.out.println(ogrenci.getFenOdev() + " sorusunu " + this.getClass().getSimpleName() + " kullanarak yapti");
	}
}

@Service
class Muzik {

	public void muzikOdeviniYap(Ogrenci ogrenci) {
		System.out
				.println(ogrenci.getMuzikOdev() + " sorusunu " + this.getClass().getSimpleName() + " kullanarak yapti");
	}
}