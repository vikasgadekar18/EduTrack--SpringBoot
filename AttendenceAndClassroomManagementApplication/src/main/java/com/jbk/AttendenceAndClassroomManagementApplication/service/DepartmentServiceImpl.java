package com.jbk.AttendenceAndClassroomManagementApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbk.AttendenceAndClassroomManagementApplication.dao.DepartmentDAO;
import com.jbk.AttendenceAndClassroomManagementApplication.entity.Department;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Department> getAllDepartments() {
        return departmentDAO.getAllDepartments();
    }

    @Override
    @Transactional(readOnly = true)
    public Department getDepartmentById(Long id) {
        return departmentDAO.getDepartmentById(id);
    }

    @Override
    @Transactional
    public void saveDepartment(Department department) {
        departmentDAO.saveDepartment(department);
    }

    @Override
    @Transactional
    public void deleteDepartment(Long id) {
        departmentDAO.deleteDepartment(id);
    }
}