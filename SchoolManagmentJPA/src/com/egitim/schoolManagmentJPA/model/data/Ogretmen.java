package com.egitim.schoolManagmentJPA.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.egitim.schoolManagmentJPA.model.data.base.BaseEntity;

@Entity
@Table(name = "OGRETMEN")
public class Ogretmen extends BaseEntity {

	private static final long serialVersionUID = 2809760051036788005L;

	@Column(name = "AD", length = 50, nullable = false)
	private String ad;

	@Column(name = "SOYAD", length = 50, nullable = false)
	private String soyAd;

	@Column(name = "DERS", length = 20, nullable = false)
	private String ders;

	/*
	 * Burada da bir ogretmen bir okul instance tutar, birden fazla ogretmen ayni
	 * okul degerini tutabilir. Buradaki fetch type: lazy olmasi; bir okul data'si
	 * cagirildiginda o okul datasina ait butun ogretmen degerlerinin cagirilmasini
	 * onler. Yani bir ogretmen cagirildiginda iliskilendirilmis okul degeri
	 * kullanilana kadar okul data'lari memory'de bulunmaz.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OKUL_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_OGRETMEN_OKUL"))
	private Okul okul;

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

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public Okul getOkul() {
		return okul;
	}

	public void setOkul(Okul okul) {
		this.okul = okul;
	}

	@Override
	@Transient
	public String info() {

		return "---\nOgretmen adi: " + this.getAd() + " - Ogretmen Soyadi: " + this.getSoyAd()
				+ " - Ogretmein verdigi ders: " + this.getDers() + " - Ogretmenin okulu: " + this.okul.getAd()
				+ " - Ogretmenin id'si: " + this.getId() + " - Ogretmenin olustugu zaman: " + this.getIslemZaman();
	}

}
