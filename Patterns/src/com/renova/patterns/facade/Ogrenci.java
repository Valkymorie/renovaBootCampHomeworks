package com.renova.patterns.facade;

public class Ogrenci { // ISTENILEN ISTEKLERI TUTAN SOMUT NESNE SINIFI

	private String matematikOdev;
	private String fenOdev;
	private String turkceOdev;
	private String muzikOdev;

	public String getMatematikOdev() {
		return matematikOdev;
	}

	public void setMatematikOdev(String matematikOdev) {
		this.matematikOdev = matematikOdev;
	}

	public String getFenOdev() {
		return fenOdev;
	}

	public void setFenOdev(String fenOdev) {
		this.fenOdev = fenOdev;
	}

	public String getTurkceOdev() {
		return turkceOdev;
	}

	public void setTurkceOdev(String turkceOdev) {
		this.turkceOdev = turkceOdev;
	}

	public String getMuzikOdev() {
		return muzikOdev;
	}

	public void setMuzikOdev(String muzikOdev) {
		this.muzikOdev = muzikOdev;
	}

}
