package com.dfs;

import java.util.Date;

public class Main {
	static StudentArrayOperation studInterface = new StudentGroup(2);
	public static void main(String[] args) {
	
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Student stud1 = new Student(1, "Maneesha", new Date(), 40.25);
		Student stud2 = new Student(2, "Dhana lakshmi", new Date(), 41.25);
		studInterface.add(stud1, 0);
		studInterface.add(stud2, 1);
		try {
		System.out.println(studInterface.getStudent(0));
		}catch(Exception e) {}
	}

}
