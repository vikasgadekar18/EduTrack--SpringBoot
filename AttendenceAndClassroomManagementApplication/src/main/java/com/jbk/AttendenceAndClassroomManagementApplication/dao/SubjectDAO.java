package com.jbk.AttendenceAndClassroomManagementApplication.dao;
import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Subject;

public interface SubjectDAO {

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    void saveSubject(Subject subject);

    void deleteSubject(Long id);
}
