package com.jbk.AttendenceAndClassroomManagementApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.AttendenceAndClassroomManagementApplication.dao.FacultyAttendanceDao;
import com.jbk.AttendenceAndClassroomManagementApplication.entity.FacultyAttendance;

import java.util.List;

@Service
public class FacultyAttendanceService {

    @Autowired
    private FacultyAttendanceDao facultyAttendanceDao;

    @Transactional
    public List<FacultyAttendance> getAllFacultyAttendances() {
        return facultyAttendanceDao.getAllFacultyAttendances();
    }

    @Transactional
    public FacultyAttendance getFacultyAttendanceById(Long id) {
        return facultyAttendanceDao.getFacultyAttendanceById(id);
    }

    @Transactional
    public void saveFacultyAttendance(FacultyAttendance facultyAttendance) {
        facultyAttendanceDao.saveFacultyAttendance(facultyAttendance);
    }

    @Transactional
    public void deleteFacultyAttendance(Long id) {
        facultyAttendanceDao.deleteFacultyAttendance(id);
    }
}
