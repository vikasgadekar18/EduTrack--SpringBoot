package com.jbk.AttendenceAndClassroomManagementApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.AttendenceAndClassroomManagementApplication.dao.SubjectDAO;
import com.jbk.AttendenceAndClassroomManagementApplication.entity.Subject;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }

    @Override
    @Transactional(readOnly = true)
    public Subject getSubjectById(Long id) {
        return subjectDAO.getSubjectById(id);
    }

    
    
    @Override
    @Transactional
    public void saveSubject(Subject subject) {
        subjectDAO.saveSubject(subject);
    }

    @Override
    @Transactional
    public void deleteSubject(Long id) {
        subjectDAO.deleteSubject(id);
    }
}