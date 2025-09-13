package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Faculty;

public interface FacultyDAO {

    List<Faculty> getAllFaculties();

    Faculty getFacultyById(Long id);

    void saveFaculty(Faculty faculty);

    void deleteFaculty(Long id);
}