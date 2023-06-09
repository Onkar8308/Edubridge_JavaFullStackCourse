package com.test.hibernate.entity;

public class Student {
	private long studentId;
	private String studentName;
	private String studentAddress;
	private String studentEmail;
	
	public Student() {
		
	}
	
	
	public Student(long studentId, String studentName, String studentAdderess, String studentEmail) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAdderess;
		this.studentEmail = studentEmail;
	}


	public long getStudentId() {
		return studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public String getStudentEmail() {
		return studentEmail;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAdderess="
				+ studentAddress + ", studentEmail=" + studentEmail + "]";
	}
	
	

}
