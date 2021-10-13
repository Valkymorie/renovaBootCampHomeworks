package com.egitim.schoolManagmentJPA.model.data.base;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public abstract class BaseEntity implements Serializable { //HER TABLODA AYNI TIPTE VE OZELLIKTE OLAN ATTRIBUTELAR BURADA TANIMLANDI

	private static final long serialVersionUID = 1017840648128509719L;

	@Id
	@Column(name = "ID", insertable = false, updatable = false, nullable = false, columnDefinition = "smallint")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ISLEM_ZAMAN", nullable = false)
	private Date islemZaman;

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Date getIslemZaman() {
		return islemZaman;
	}

	public void setIslemZaman(Date islemZaman) {
		this.islemZaman = islemZaman;
	}
	
	@Transient
	public abstract String info();  //HER SINIFA GORE OZELLESTIRILEREK DEGERLERI EKRANA YAZDIRAN METHOD

}
