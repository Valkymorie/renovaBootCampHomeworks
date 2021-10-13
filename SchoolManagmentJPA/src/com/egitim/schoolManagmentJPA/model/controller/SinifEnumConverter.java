package com.egitim.schoolManagmentJPA.model.controller;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.egitim.schoolManagmentJPA.model.data.base.SinifEnum;

@Converter
public class SinifEnumConverter implements AttributeConverter<SinifEnum, Short> { //VERITABANI VE ENTITY ARASI TYPE DEGISTIRME ISLEMLERI

	@Override
	public Short convertToDatabaseColumn(SinifEnum attribute) {

		if (attribute == null) {
			return 0;
		}

		switch (attribute) {
		case ONE:
			return 1;
		case TWO:
			return 2;
		case THREE:
			return 3;
		case FOUR:
			return 4;
		default:
			throw new IllegalArgumentException(attribute + " bu okulda bir sinif seviyesi degil.");
		}

	}

	@Override
	public SinifEnum convertToEntityAttribute(Short dbData) {

		if (dbData == null) {
			return null;
		}

		switch (dbData) {
		case 1:
			return SinifEnum.ONE;
		case 2:
			return SinifEnum.TWO;
		case 3:
			return SinifEnum.THREE;
		case 4:
			return SinifEnum.FOUR;
		default:
			throw new IllegalArgumentException(dbData + " bu okulda bir sinif seviyesi degil.");
		}

	}

}
