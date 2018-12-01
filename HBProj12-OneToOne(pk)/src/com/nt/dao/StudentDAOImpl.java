package com.nt.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.nt.entity.LibraryMembership;
import com.nt.entity.Student;
import com.nt.entity.Student;
import com.nt.utility.HibernateUtility;

public class StudentDAOImpl implements StudentDAO {

	public void insertData(){
		Session ses=null;
		Student sr=null;
		LibraryMembership lm=null;
		Student sd=null;
		Transaction tx=null;
		boolean flag=false;
		
		ses=HibernateUtility.getSession();
		
		sd=new Student();
		sd.setSname("mahesh");
		sd.setAddrs("hyd");
		lm=new LibraryMembership();
		lm.setDoj(new Date());
		lm.setType("gold");
		//set parent to child and child to parent
		sd.setChild(lm);
		lm.setParent(sd);
		try {
			tx=ses.beginTransaction();
			ses.save(sd);
			flag=true;
		}
		catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("saved");
			}
			else {
				 tx.rollback();
				 System.out.println("not saved");
			}
			HibernateUtility.closeSession(ses);
		}
	}

	/*@Override
	public void removeOneOfTheChildFromParent() {
		Session ses=null;
		Student s=null;
		List<Student> child=null;
		boolean flag=false;
		Transaction tx=null;
		ses=HibernateUtility.getSession();
		s=ses.get(Student.class,6);
		child=s.getChilds();
		try {
			tx=ses.beginTransaction();
			child.remove(0);
			flag=true;
		}
		catch(HibernateException he) {
			he.printStackTrace();
			flag=false;
		}
		catch(Exception e) {
			e.printStackTrace();
			flag=false;
		}
		finally {
			if(flag) {
				tx.commit();
				System.out.println("child removed from pparent relation");
			}
			else {
				 tx.rollback();
				 System.out.println("child not removed from pparent relation");
			}
			HibernateUtility.closeSession(ses);
		}
		
	}
*/
}
