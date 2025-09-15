package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Department;

public interface DepartmentDAO {

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);

    void saveDepartment(Department department);

    
    void deleteDepartment(Long id);
}
