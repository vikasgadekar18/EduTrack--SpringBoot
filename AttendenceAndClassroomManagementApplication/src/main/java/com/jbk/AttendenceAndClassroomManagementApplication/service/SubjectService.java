package com.jbk.AttendenceAndClassroomManagementApplication.service;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Subject;

public interface SubjectService {

    List<Subject> getAllSubjects();

    Subject getSubjectById(Long id);

    void saveSubject(Subject subject);

    void deleteSubject(Long id);
}