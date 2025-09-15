package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Classroom;

public interface ClassroomDAO {

    List<Classroom> getAllClassrooms();

    Classroom getClassroomById(Long id);

    void saveClassroom(Classroom classroom);

    
    
    void deleteClassroom(Long id);
}