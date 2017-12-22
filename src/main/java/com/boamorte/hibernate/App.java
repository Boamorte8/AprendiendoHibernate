package com.boamorte.hibernate;

import java.util.List;

import com.boamorte.hibernate.dao.TeacherDaoImpl;
import com.boamorte.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World, Java and Hibernate!" );
        
        try {
        	Teacher teacher = new Teacher("Diego Botia", "Avatar4");
        	Teacher teacher0 = new Teacher("Juan Carlos", "Avatar5");
        	TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
//        	teacherDaoImpl.saveTeacher(teacher);
//        	teacherDaoImpl.saveTeacher(teacher0);
        	
//        	Teacher teacherToDelete = teacherDaoImpl.findById((long) 5);
//        	teacherDaoImpl.deleteTeacher(teacherToDelete);
        	
        	teacherDaoImpl.deleteTeacher((long) 6);
//        	System.out.println("Nombre profesor a actualizar: " + teacher.getName());
//        	teacher.setName("Jhonatan Diosa");
//        	teacherDaoImpl.updateTeacher(teacher);
        	List<Teacher> listTeachers = teacherDaoImpl.findAllTeacher();
        	
        	for (Teacher teacher2 : listTeachers) {
				System.out.println("Nombre: " + teacher2.getName());
			}
        	
        } catch(Exception e) {
        	System.out.println("No se logró realizar la transacción: " + e);
        }
        
    }
}
