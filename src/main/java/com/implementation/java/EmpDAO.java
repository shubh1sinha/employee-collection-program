package com.implementation.java;
/**
 * @author shubhsinha
 */
import java.util.List;

import com.entity.java.Emp;
import com.exceptions.java.EmpExistsException;
import com.exceptions.java.EmpNotFoundException;

public interface EmpDAO {
public Emp findBy(int id) throws EmpNotFoundException;
List<Emp> findAll();
public String addEmp(Emp e) throws EmpExistsException;
}
