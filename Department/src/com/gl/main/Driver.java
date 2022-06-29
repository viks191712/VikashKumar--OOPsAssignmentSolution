package com.gl.main;


import com.gl.departmentservice.AdminDepartment;
import com.gl.departmentservice.HRDepartment;
import com.gl.departmentservice.TechDepartment;

public class Driver {

	public static void main(String args[]) {
		AdminDepartment a1 = new AdminDepartment();
		HRDepartment b1 = new HRDepartment();
		TechDepartment 	c1 = new TechDepartment();
		// Admin Department
		
		System.out.println("Welcome to " + a1.departmentName());
		System.out.println(a1.getTodaysWork());
		System.out.println(a1.getWorkDeadline());
		System.out.println(a1.isTodayAHoliday());
		System.out.println();
		//HR Department
		
		System.out.println("Welcome to " + b1.departmentName());
		System.out.println(b1.doActivity());
		System.out.println(b1.getTodaysWork());
		System.out.println(b1.getWorkDeadline());
		System.out.println(b1.isTodayAHoliday());
		System.out.println();
		
		//Tech Department
		
		System.out.println("Welcome to " + c1.departmentName());
		System.out.println(c1.getTodaysWork());
		System.out.println(c1.getWorkDeadline());
		System.out.println(c1.getTechStackInformation());
		System.out.println(c1.isTodayAHoliday());
		System.out.println();
	}
}

