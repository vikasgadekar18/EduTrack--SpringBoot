package com.jbk.AttendenceAndClassroomManagementApplication.service;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.ClassSchedule;

public interface ClassScheduleService {

	List<ClassSchedule> getAllClassSchedules();

	ClassSchedule getClassScheduleById(Long id);

	void saveClassSchedule(ClassSchedule classSchedule);

	
	
	void deleteClassSchedule(Long id);
}