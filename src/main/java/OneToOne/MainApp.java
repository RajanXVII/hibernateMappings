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
		
		InstructorDetail indetail=sess.get(InstructorDetail.class, 102);
		//indetail.setInstructor(instr);
		
		//sess.save(indetail);
		System.out.println(indetail.getInstructor());
		sess.getTransaction().commit();
	}
}
