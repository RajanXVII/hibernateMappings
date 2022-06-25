package OneToOne;

import java.sql.SQLException;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import OneToOne.Entities.Instructor;
import OneToOne.Entities.InstructorDetail;

public class MainApp {
	public static void main(String[] args) throws SQLException {
		SessionFactory sf= new 	Configuration().configure().addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class).buildSessionFactory();
		
		Session sess=sf.getCurrentSession();
		sess.beginTransaction();
		
		  Instructor instructor=new Instructor("pratik", "sonvane",
		  "pratik17.rs@gmail.com"); InstructorDetail instructorDetail=new
		  InstructorDetail("pratikyt", "teaching");
		 
		int id=4;
		//Instructor instructor=sess.get(Instructor.class, id);
		instructor.setInstructorDetail(instructorDetail);
		sess.save(instructor);
		//sess.delete(instructor);
		/*
		 * if(Objects.nonNull(instructor)) { System.out.println("deleted!!"); }
		 */
		System.out.println("persisted!!");
		sess.getTransaction().commit();
	}
}
