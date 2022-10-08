package com.implementation.java;
import java.util.ArrayList;
/**
 * @author shubhsinha
 */
import java.util.List;

import com.data.java.EmpStore;
import com.entity.java.Emp;
import com.exceptions.java.EmpExistsException;
import com.exceptions.java.EmpNotFoundException;

public class EmpDAOImpl implements EmpDAO {
/**
 * @exception EmpNotFoundException
 * @exception EmpExisitsException
 */

	public List<Emp> findAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Emp>(EmpStore.db.values());
	}

	public String addEmp(Emp e) throws EmpExistsException {
		// TODO Auto-generated method stub
		
		try {
			if(EmpStore.db.containsKey(e.getEmpId())) {
				throw new EmpExistsException();
			}
			else {
				EmpStore.db.put(e.getEmpId(), e);
				return e.toString();
			}
		}catch(EmpExistsException ex) {
			System.out.println("DAO Layer: Employee Already Exisists. "+ex);
			throw ex;
		}
		
	}

	@Override
	public Emp findBy(int id) throws EmpNotFoundException {
		// TODO Auto-generated method stub
		try {
			if(EmpStore.db.containsKey(id)) {
				System.out.println("Found: "+id);
				return EmpStore.db.get(id);
			}
			else {
				throw new EmpNotFoundException();
			}
			
		}
		catch(EmpNotFoundException ex) {
			System.out.println("Emp Not Found");
			throw ex;
		}
		
	}

}
