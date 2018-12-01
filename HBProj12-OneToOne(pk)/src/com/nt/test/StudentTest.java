package com.nt.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;
import com.nt.entity.Student;
import com.nt.entity.Student;
import com.nt.utility.HibernateUtility;

public class StudentTest {

	public static void main(String[] args) {
		StudentDAO dao=null;
		dao=StudentDAOFactory.getInstance();
		dao.insertData();
		//dao.removeOneOfTheChildFromParent();
			HibernateUtility.closeSessionFactory();
		}

}
