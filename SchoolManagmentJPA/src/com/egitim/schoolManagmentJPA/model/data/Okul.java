package com.egitim.schoolManagmentJPA.model.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.egitim.schoolManagmentJPA.model.data.base.BaseEntity;
import com.egitim.schoolManagmentJPA.model.data.base.OkulTipiEnum;

@Entity
@Table(name = "OKUL")
public class Okul extends BaseEntity {

	private static final long serialVersionUID = -5438310904644386498L;

	@Column(name = "AD", length = 100, nullable = false)
	private String ad;

	@Enumerated(EnumType.STRING)
	@Column(name = "OKUL_TIPI", length = 25, nullable = false)
	private OkulTipiEnum okulTipi;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public OkulTipiEnum getOkulTipi() {
		return okulTipi;
	}

	public void setOkulTipi(OkulTipiEnum okulTipi) {
		this.okulTipi = okulTipi;
	}

	@Override
	@Transient
	public String info() {

		return "---\nOkul adi: " + this.getAd() + " - Okul turu: " + this.getOkulTipi().toString() + " - Okul id'si: "
				+ this.getId() + " - Okul olusma zamani: " + this.getIslemZaman();
	}

}
