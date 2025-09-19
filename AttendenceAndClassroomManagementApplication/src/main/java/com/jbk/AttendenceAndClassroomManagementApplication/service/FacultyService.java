package com.jbk.AttendenceAndClassroomManagementApplication.service;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Faculty;

public interface FacultyService {

    List<Faculty> getAllFaculties();

    Faculty getFacultyById(Long id);

    void saveFaculty(Faculty faculty);

    
    void deleteFaculty(Long id);
    
}