package com.boamorte.hibernate.dao;

import java.util.List;

import com.boamorte.hibernate.model.Teacher;

public interface TeacherDao {

	void saveTeacher(Teacher teacher);
	
	void deleteTeacher(Long idTeacher);
	
	void updateTeacher(Teacher teacher);
	
	List<Teacher> findAllTeacher();
	
	Teacher findById(Long idTeacher);
	
	Teacher findByName(String name);
}
