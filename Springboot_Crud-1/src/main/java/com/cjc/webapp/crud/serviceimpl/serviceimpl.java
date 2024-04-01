package com.cjc.webapp.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.webapp.crud.model.Student;
import com.cjc.webapp.crud.repository.homeRepository;
import com.cjc.webapp.crud.service.Homeservice;

@Service
public class serviceimpl implements Homeservice {
	
	
	@Autowired
    homeRepository hr;

	@Override
	public void saveData(Student s) {
		hr.save(s);

	}

	@Override
	public Student Logincheck(String un, String pass) {
		return hr.findAllByUnameAndPassword(un,pass);
	}

	@Override
	public Iterable<Student> displayData() {
	return hr.findAll();
		
	}

	@Override
	public Student getData(int uid) {
		
		return hr.findByUid(uid);	}

	@Override
	public void deleteData(int id) {
		hr.deleteById(id);
	
	}

}
