package com.student.springboot.studentreg.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="students_daily_attendance")
public class StudentAttendance {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="date")
	private Date date;
	
//	@Column(name="isPresent", nullable=false)
//	@Type(type = "org.hibernate.type.NumericBooleanType")
//	private boolean isPresent;
	
	@ManyToOne(cascade= {CascadeType.DETACH,
			CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="student_id")
	private StudentRegistration studentRegistration;

	public StudentAttendance() {
	}

//	public StudentAttendance(Date date, boolean isPresent) {
//		this.date = date;
//		this.isPresent = isPresent;
//	}
//	
	public StudentAttendance(Date date) {
		this.date = date;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public boolean isPresent() {
//		return isPresent;
//	}

//	public void setPresent(boolean isPresent) {
//		this.isPresent = isPresent;
//	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

//	@Override
//	public String toString() {
//		return "StudentAttendance [id=" + id + ", date=" + date + ", isPresent=" + isPresent + ", studentRegistration="
//				+ studentRegistration + "]";
//	}
	
	
	
}
