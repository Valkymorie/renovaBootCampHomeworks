package com.renova.spring.system;

import java.util.List;

import com.renova.spring.domain.AdministrativeStaff;
import com.renova.spring.domain.HeadMaster;
import com.renova.spring.domain.Student;
import com.renova.spring.domain.Teacher;

public class HeadMasterManagment extends HeadMaster implements AdministrativeStaff {

	@Override
	public void closeSchool() {
		System.out.println("OKUL KAPANMISTIR.");
	}

	@Override
	public void openScool() {

		System.out.println("OKUL ACILMISTIR");
	}

}
