package com.cjc.webapp.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.webapp.crud.model.Student;

@Repository
public interface homeRepository extends CrudRepository<Student, Integer> {

	Student findAllByUnameAndPassword(String un, String pass);
    Student findByUid(int uid);
}
