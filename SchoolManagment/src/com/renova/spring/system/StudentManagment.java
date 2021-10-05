package com.renova.spring.system;

import com.renova.spring.domain.Student;

public class StudentManagment {

	public void addLesson(Student student, String lesson) {  //OGRENCI OLUSTUKTAN SONRA OGRENCIYE EKLENECEK DERSLER ICIN METHOD

		student.getLessons().add(lesson);

	}

	public void removeLesson() {
	}  // OGRENCININ DERS LISTESINDEN DERS SILMEK ICIN METHOD

	

}
