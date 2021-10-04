package com.renova.spring.system;

import com.renova.spring.domain.AcademicStaff;
import com.renova.spring.domain.Teacher;

public class TeacherManagment extends Teacher implements AcademicStaff {  // OGRETMEN DURUM YONETIMI

	@Override
	public void teachLesson(boolean work) { 

		if (work) {
			System.out.println("OGRENCILER ZATEN DERSTE");
		} else {
			System.out.println("OGRENCILER DERSE GIRDI");
			work = true;
		}
	}

	@Override
	public void giveHomeWork(int number) {

		System.out.println("OGRENCILERE " + number + " ADET ODEV VERILMISTIR.");

	}

}
