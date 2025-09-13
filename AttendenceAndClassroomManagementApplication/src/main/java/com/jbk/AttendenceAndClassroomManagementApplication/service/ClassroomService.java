package com.jbk.AttendenceAndClassroomManagementApplication.service;




import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Classroom;

public interface ClassroomService {

    List<Classroom> getAllClassrooms();

    Classroom getClassroomById(Long id);

    void saveClassroom(Classroom classroom);

    void deleteClassroom(Long id);
}
