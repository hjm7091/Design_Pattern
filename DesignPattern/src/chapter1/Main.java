package chapter1;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("manSup");
		Student s2 = new Student("gilDong");
		Course se = new Course("Software Engineering");
		Course dp = new Course("Design Pattern");
		Transcript t1 = new Transcript(s1, se); //manSup은 소프트웨어 공학 수강
		Transcript t2 = new Transcript(s1, dp); //manSup은 디자인 패턴 수강
		Transcript t3 = new Transcript(s2, dp); //gilDong은 디자인 패턴 수강
		
		t1.setDate("2012");
		t1.setGrade("B0");
		t2.setDate("2012");
		t2.setGrade("D+");
		
		t3.setDate("2013");
		t3.setGrade("C+");
		
		Vector<Course> courses;
		courses = s1.getCourses();
		for(Course course : courses) {
			System.out.println(course.getName());
		}
		
		System.out.println();
		
		Vector<Student> students;
		students = dp.getStudents();
		for(Student student : students) {
			System.out.println(student.getName());
		}
	}

}
