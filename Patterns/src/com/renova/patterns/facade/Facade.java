package com.renova.patterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Facade { //HANGI METHODUN CALISACAGINI KONTROL EDEN ARA KATMAN

	@Autowired private Matematik matematik;
	@Autowired private Fen fen;
	@Autowired private Turkce turkce;
	@Autowired private Muzik muzik;

	// FARKLI OLAN BUTUN ISTEKLERI KONTROL EDEN METHODLAR
	//METHODLAR CAGIRILIR VE GERIDE KALAN ISLEMLER BU SINIFLA ILGILI OLMAZ
	public void matematikOdev(Ogrenci ogrenci) {

		matematik.matematikOdeviniYap(ogrenci);
	}

	public void fenOdev(Ogrenci ogrenci) {

		fen.fenOdeviniYap(ogrenci);
	}

	public void turkceOdev(Ogrenci ogrenci) {

		turkce.turkceOdeviniYap(ogrenci);
	}

	public void muzikOdev(Ogrenci ogrenci) {

		muzik.muzikOdeviniYap(ogrenci);
	}

}
