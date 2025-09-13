package com.jbk.AttendenceAndClassroomManagementApplication.entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "class_schedules")

public class ClassSchedule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "subject_id", nullable = false)
	private Long subjectId;

	@Column(name = "classroom_id", nullable = false)
	private Long classroomId;

	@Column(name = "day_of_week", nullable = false)
	private String dayOfWeek;

	@Column(name = "start_time", nullable = false)
	private Time startTime;

	@Column(name = "end_time", nullable = false)
	private Time endTime;

	public ClassSchedule(Long id, Long subjectId, Long classroomId, String dayOfWeek, Time startTime, Time endTime) {
		super();
		this.id = id;
		this.subjectId = subjectId;
		this.classroomId = classroomId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public ClassSchedule(Long subjectId, Long classroomId, String dayOfWeek, Time startTime, Time endTime) {
		super();
		this.subjectId = subjectId;
		this.classroomId = classroomId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public ClassSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public Long getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", subjectId=" + subjectId + ", classroomId=" + classroomId + ", dayOfWeek="
				+ dayOfWeek + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

	
}