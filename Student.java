package org.student;

import org.department.Department;

public class Student extends Department
{
	public void StudentName()
	{
		System.out.println("Athira");
	}
	
	public void StudentDepartment()
	{
		System.out.println("ECE");
		}
	public void Id()
	{
		System.out.println(100);
		}
	public static void main(String[] args) {
		Student jk=new Student();
		jk.StudentName();
		jk.StudentDepartment();
		jk.deptName();
		jk.collegeName();
		jk.collegeCode();
		jk.collegeRank();
		
		
		
	}
}
