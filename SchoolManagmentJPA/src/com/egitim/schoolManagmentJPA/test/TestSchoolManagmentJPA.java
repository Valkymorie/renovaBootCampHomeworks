package com.egitim.schoolManagmentJPA.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.hibernate.Session;

import org.junit.jupiter.api.Test;

import com.egitim.schoolManagmentJPA.model.data.Mudur;
import com.egitim.schoolManagmentJPA.model.service.DatabaseService;
import com.egitim.schoolManagmentJPA.utility.HibernateUtility;

class TestSchoolManagmentJPA {

	@Test
	void test() {

		DatabaseService databaseService = new DatabaseService();

		databaseService.printEntityList(databaseService.selectEntityList("Okul"), "Okul");
		databaseService.printEntityList(databaseService.selectEntityList("Mudur"),"Mudur");
		databaseService.printEntityList(databaseService.selectEntityList("Ogretmen"),"Ogretmen");
		databaseService.printEntityList(databaseService.selectEntityList("Ogrenci"),"Ogrenci");

	}

}
