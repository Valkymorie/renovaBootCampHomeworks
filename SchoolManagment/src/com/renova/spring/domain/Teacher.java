package com.renova.spring.domain;

import com.renova.spring.system.TeacherManagment;

public class Teacher {

	private String name;
	private String lecture;
	private TeacherManagment teacherManagment;


	public TeacherManagment getTeacherManagment() {
		return teacherManagment;
	}

	public void setTeacherManagment(TeacherManagment teacherManagment) {
		this.teacherManagment = teacherManagment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

}
