package com.egitim.schoolManagmentJPA.model.service;

import java.io.Console;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Session;

import com.egitim.schoolManagmentJPA.model.data.Mudur;
import com.egitim.schoolManagmentJPA.model.data.base.BaseEntity;
import com.egitim.schoolManagmentJPA.utility.HibernateUtility;

public class DatabaseService {
	
	private static Session session= HibernateUtility.getSessionFactory().openSession();
	
	/*Gelen entity ismine gore query olusutan method.
	 * Uygulamadaki butun entityler ortak bir sinifi extends ettikleri icin
	 * ortak bir method ile kontrol edilebilmektedirler.*/
	@SuppressWarnings({ "unchecked", "unused" })
	public ArrayList<? extends BaseEntity> selectEntityList(String entityName){  
		return  (ArrayList<BaseEntity>) session.createQuery("FROM "+ entityName).list();
	}
	
	@SuppressWarnings("unused")
	public void printEntityList (ArrayList<? extends BaseEntity> entityList, String entityName) {	
		System.out.println("\n"+entityName+" KAYITLARI");
		
		for(BaseEntity entity: entityList) {
			System.out.println(entity.info());	
			
			if(entity instanceof Mudur) { // EGER ENTITY TYPE MUDUR ISE MUDURE OZEL OLAN METHOD DA CALISIR
				((Mudur) entity).getOgrenciInfo();
			}
			
		}
	}

}
