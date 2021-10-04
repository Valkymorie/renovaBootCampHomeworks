package com.renova.spring.domain;

import java.util.List;

import com.renova.spring.system.HeadMasterManagment;

public class HeadMaster {

	private String name;
	private List<Student> studentList;
	private List<Teacher> teacherList;
	private HeadMasterManagment headMasterManagment;
	
	

	public List<Teacher> getTeacherList() {
		return teacherList;
	}

	public void setTeacherList(List<Teacher> teacherList) {
		this.teacherList = teacherList;
	}

	

	private void setHeadMasterManagment() {
		if (headMasterManagment == null) {
			headMasterManagment = new HeadMasterManagment();
		}
	}

	public void disposeHeadMaster() { //DESTROY-METHOD
		headMasterManagment.closeSchool();
	}

	public void initHeadMaster() {  //INIT-METHOD
		System.out.println("OKUL TANIMLANMISTIR");
		setHeadMasterManagment();
		headMasterManagment.openScool();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
