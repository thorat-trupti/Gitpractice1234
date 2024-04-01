package com.cjc.webapp.crud.service;

import com.cjc.webapp.crud.model.Student;

public interface Homeservice {
	
	public void saveData(Student s);
	public Student Logincheck(String un , String pass);
	public Iterable<Student> displayData();
	public Student getData(int uid);
	public void deleteData(int id);

}
