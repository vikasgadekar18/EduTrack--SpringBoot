package com.jbk.AttendenceAndClassroomManagementApplication.service;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Department;

public interface DepartmentService {

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    void saveDepartment(Department department);

    void deleteDepartment(Long id);
    
}
