package com.renova.spring.domain;

import java.util.HashSet;

import com.renova.spring.system.StudentManagment;

public class Student {

	private String name;
	private int studentId;
	private int year;
	private HashSet<String> lessons;
	private boolean work;

	public void info() {
		System.out.println("Ogrenci adi: " + name + "\nOgrenci numarasi: " + studentId + "\nOgrenci yili: " + year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public HashSet<String> getLessons() {
		return lessons;
	}

	public void setLessons(HashSet<String> lessons) {
		this.lessons = lessons;
	}

	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

}
