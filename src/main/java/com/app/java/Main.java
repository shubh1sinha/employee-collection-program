package com.app.java;

import com.entity.java.Emp;
import com.exceptions.java.EmpExistsException;
import com.exceptions.java.EmpNotFoundException;
import com.implementation.java.EmpDAO;
import com.implementation.java.EmpDAOImpl;

/**
 * 
 * @author shubhsinha
 *
 */

public class Main {
	public static void main(String[] args) {
		EmpDAO dao = new EmpDAOImpl();

		for (Emp e1 : dao.findAll()) {
			System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getSalary());
		}

		// Employe Checking
		System.out.println("\n--Check and Add Employee--");
		Emp e = new Emp(3, "Mangal", "Bhilai", 56000);
		try {
			dao.addEmp(e);
			System.out.println("Employee Added.." + e);

		} catch (EmpExistsException ex) {
			System.out.println("Error caught: " + ex);
		}

		// Id Checking
		System.out.println("\n---Check By Id---");

		try {

			dao.findBy(10);
		} catch (EmpNotFoundException e2) {
			// TODO Auto-generated catch block
			System.out.println("Error caught: " + e2);
		}
		System.out.println("\n-----Final DataBase----");
		for (Emp e1 : dao.findAll()) {
			System.out.println(e1.getEmpId() + " " + e1.getName() + " " + e1.getSalary());
		}
		
	}

}
