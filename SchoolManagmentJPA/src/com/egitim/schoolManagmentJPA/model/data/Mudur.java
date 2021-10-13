package com.egitim.schoolManagmentJPA.model.data;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.egitim.schoolManagmentJPA.model.data.base.BaseEntity;

@Entity
@Table(name = "MUDUR")
public class Mudur extends BaseEntity {

	private static boolean control = true;
	private static final long serialVersionUID = -386877631286693622L;

	@Column(name = "AD", length = 50, nullable = false)
	private String ad;

	@Column(name = "SOYAD", length = 50, nullable = false)
	private String soyAd;

	/*
	 * Mudur ogrenci tablolari arasi one to many iliskisi vardir. tablodaki bir
	 * mudur birden fazla ogrenci tutabilmektedir mappedBy degeri ise Ogrenci
	 * sinifindaki mapping yapacak attribute ismini ifade eder.
	 */
	@OneToMany(mappedBy = "mudur")
	private Set<Ogrenci> ogrenciler;

	public Set<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(Set<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	@Override
	@Transient
	public String info() {
		return "\nMudur ismi: " + this.getAd() + " - Mudur Soyadi: " + this.getSoyAd() + " - Mudur id'si: " + this.getId()
				+ " - Mudur olusturulma zamani: " + this.getIslemZaman().toString();
	}

	@Transient
	public void getOgrenciInfo() { // DIGER SINIFLARDAN FARKLI OLARAK BIRDEN FAZLA TUTULABILECEK OGRENCI BILGILERI
									// DE YAZDIRILIR

		if (control) {
			System.out.println(this.getAd() + " adli mudure kayitli ogrenciler listesi:");
		}

		for (Ogrenci ogrenci : ogrenciler) {
			System.out.println("Ogrenci adi: " + ogrenci.getAd() + " - Ogrenci Soyadý: " + ogrenci.getSoyAd()
					+ " - Ogrencinin id'si: " + ogrenci.getId());
		}
	}

}
