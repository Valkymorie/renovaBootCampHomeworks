package com.egitim.schoolManagmentJPA.model.data;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.egitim.schoolManagmentJPA.model.controller.SinifEnumConverter;
import com.egitim.schoolManagmentJPA.model.data.base.BaseEntity;
import com.egitim.schoolManagmentJPA.model.data.base.SinifEnum;

@Entity
@Table(name = "OGRENCI")
public class Ogrenci extends BaseEntity {

	private static final long serialVersionUID = 352605463583109860L;

	@Column(name = "AD", length = 50, nullable = false)
	private String ad;

	@Column(name = "SOYAD", length = 50, nullable = false)
	private String soyAd;

	@Column(name = "NUMARA", nullable = false, columnDefinition = "smallint")
	private Short numara;

	@Column(name = "SINIF", nullable = false, columnDefinition = "smallint")
	@Convert(converter = SinifEnumConverter.class)
	private SinifEnum sinif;

	/*
	 * Buradaki many to one anotasyonu bu entityden olusmus birden fazla instance'ýn
	 * farklý bir entity'nin instance'na mapping yaparak iliskilendirmeyi amaclar.
	 * Buradaki many to one anotasyonu ise cift yonlu iliski kurmak icin kullanildi,
	 * burada tutarsizlik onlenmistir ve iki yonlu iliski sayesinde bir ogrencinin
	 * yanlýs mudure eklenmesi onlenebilmektedir.
	 */
	@ManyToOne
	@JoinColumn(name = "MUDUR_ID", nullable = false)
	private Mudur mudur;

	/*
	 * Burada bir ogretmenin birden fazla ogrenciye sahip olabilecegi amaclanarak
	 * many to one mapping yapilmistir. Burada mapping islemine sahip olan taraf
	 * ogrenci oldugundan dolayi ogrenciler ogretmeni ile iliskilendirilebilir ve
	 * birden fazla ogrenci bir ogretmen ile iliskilendirilebilir.
	 */
	@ManyToOne
	@JoinColumn(name = "OGRETMEN_ID", nullable = false, foreignKey = @ForeignKey(name = "FK_OGRENCI_OGRETMEN"))
	private Ogretmen ogretmen;

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

	public Short getNumara() {
		return numara;
	}

	public void setNumara(Short numara) {
		this.numara = numara;
	}

	public SinifEnum getSinif() {
		return sinif;
	}

	public void setSinif(SinifEnum sinif) {
		this.sinif = sinif;
	}

	public Mudur getMudur() {
		return mudur;
	}

	public void setMudur(Mudur mudur) {
		this.mudur = mudur;
	}

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	@Override
	@Transient
	public String info() {

		return "---\nOgrencinin adi: " + this.getAd() + " - Ogrencinin Soyadi: " + this.getSoyAd()
				+ " - Ogrencinin numarasi: " + this.getNumara() + " - Ogrencinin sinifi: " + this.getSinif().toString()
				+ " - Ogrencinin muduru: " + this.getMudur().getAd() + " - Ogrencinin ogretmeni: "
				+ this.getOgretmen().getAd() + " - Ogrencinin id'si: " + this.getId() + " - Ogrencinin olusma zamani: "
				+ this.getIslemZaman();
	}

}
