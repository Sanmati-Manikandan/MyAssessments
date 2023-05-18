package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The student's name is Manikandan");
	}

	public void studentDept() {
		System.out.println("The student's department is Master of Computer Applications");
	}

	public void studentId() {
		System.out.println("The student's Id is 1234567890");
	}

	public static void main(String[] args) {

		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
