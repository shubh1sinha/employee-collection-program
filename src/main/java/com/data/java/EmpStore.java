package com.data.java;

import java.util.HashMap;

import com.entity.java.Emp;

public class EmpStore {
	public static HashMap<Integer, Emp> db = new HashMap<>();

	static {
		System.out.println("Db Initialized ...");
		db.put(1, new Emp(1, "Shubh", "Delhi", 6500002));
		db.put(2, new Emp(2, "Sinha", "Delhi", 6500003));
		db.put(3, new Emp(3, "Shubham", "Delhi", 6500005));
		db.put(4, new Emp(4, "Shubhansh", "Delhi", 6500004));
		db.put(5, new Emp(5, "Shubhi", "Delhi", 6500001));
	}
	private EmpStore(){
		
	}

}
