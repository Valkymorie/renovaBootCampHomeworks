package com.renova.patterns.builder;

public class Ogrenci  extends OgrenciFactoryBean{

	private String ad;
	private String soyAd;
	private String numara;
	private String sinif;
	private String okul;

	public String getAd() {
		return ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public String getNumara() {
		return numara;
	}

	public String getSinif() {
		return sinif;
	}

	public String getOkul() {
		return okul;
	}

	public Ogrenci(Builder builder) {
		this.ad = builder.ad;
		this.soyAd = builder.soyAd;
		this.numara = builder.numara;
		this.sinif = builder.sinif;
		this.okul = builder.okul;
	}

	public static class Builder {
		private String ad, soyAd, numara, sinif, okul;

		//XML KONFIGURASYONU YANI FACTORY-METHOD ICIN GEREKLI METHODLAR
		public void setAd(String ad) {
			this.ad = ad;
		}

		public void setSoyAd(String soyAd) {
			this.soyAd = soyAd;
		}

		public void setNumara(String numara) {
			this.numara = numara;
		}

		public void setSinif(String sinif) {
			this.sinif = sinif;
		}

		public void setOkul(String okul) {
			this.okul = okul;
		}

		public Builder() {

		}

		public Ogrenci build() {
			return new Ogrenci(this);
		}
		
		/* KOD ILE UYGULANACAK BUILDER PATTERN ICIN GEREKLI METHODLAR
		
		public Builder ad(String ad) {
			this.ad = ad;
			return this;
		}

		public Builder soyAd(String soyAd) {
			this.soyAd = soyAd;
			return this;
		}

		public Builder numara(String numara) {
			this.numara = numara;
			return this;
		}

		public Builder sinif(String sinif) {
			this.sinif = sinif;
			return this;
		}

		public Builder okul(String okul) {
			this.okul = okul;
			return this;
		}*/

	}

}
