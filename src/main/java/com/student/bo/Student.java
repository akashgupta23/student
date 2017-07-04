package com.student.bo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable {

	private static final long serialVersionUID = -8251613890364154602L;

	private long studentId;
	private String studentName;
	private Set<Course> courses = new HashSet<Course>();
	
	public Student() {
	}

	public Student(String studentName, Set<Course> courses) {
		this.studentName = studentName;
		this.courses = courses;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
