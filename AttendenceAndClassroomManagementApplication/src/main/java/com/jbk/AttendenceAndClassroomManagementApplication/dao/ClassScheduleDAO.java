package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.ClassSchedule;

public interface ClassScheduleDAO {

    List<ClassSchedule> getAllClassSchedules();

    ClassSchedule getClassScheduleById(Long id);

    void saveClassSchedule(ClassSchedule classSchedule);

 
    void deleteClassSchedule(Long id);
}