package com.boamorte.hibernate.dao;

import java.util.List;

import com.boamorte.hibernate.model.Teacher;

public class TeacherDaoImpl extends PlatziSession implements TeacherDao {
	
	private PlatziSession platziSession;

	public TeacherDaoImpl() {
		platziSession = new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		try {
			platziSession.getSession().persist(teacher);
			platziSession.getSession().getTransaction().commit();			
		} catch(Exception e) {
			System.out.println("Error al crear al teacher: " + e.getMessage());
		}
		
	}

	public void deleteTeacher(Teacher teacher) {
		try {
			platziSession.getSession().remove(teacher);
			platziSession.getSession().getTransaction().commit();			
		} catch(Exception e) {
			System.out.println("Error al actualizar teacher: " + e.getMessage());
		}
	}
	
	public void deleteTeacher(Long idTeacher) {
		try {
			platziSession.getSession().createQuery("delete from Teacher where id = :ID")
				.setParameter("ID", new Long(idTeacher)).executeUpdate();
			platziSession.getSession().getTransaction().commit();			
		} catch(Exception e) {
			System.out.println("Error al actualizar teacher: " + e.getMessage());
		}
	}

	public void updateTeacher(Teacher teacher) {
		try {
			platziSession.getSession().update(teacher);
			platziSession.getSession().getTransaction().commit();			
		} catch(Exception e) {
			System.out.println("Error al actualizar teacher: " + e.getMessage());
		}
	}

	public List<Teacher> findAllTeacher() {
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	public Teacher findById(Long idTeacher) {
		return platziSession.getSession().load(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		return platziSession.getSession().load(Teacher.class, name);
	}

}
