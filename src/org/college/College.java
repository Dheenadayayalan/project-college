package org.college;

public class College {
	private void collegeName() {
		System.out.println("jeppiar");

	}
	private void collegeCode() {
		System.out.println("603116");

	}
	private void collegeRank() {
		System.out.println("3");

	}
	public static void main(String[] args) {
		College a=new College();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		Student b=new Student();
		b.studentName();
		b.studentDepartment();
		b.studentId();
		Hostel c=new Hostel();
		c.hostelName();
		Dept d=new Dept();
		d.deptName();
	}

}
