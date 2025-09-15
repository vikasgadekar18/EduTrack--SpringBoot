package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Course;

public interface CourseDAO {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    void saveCourse(Course course);

    
    void deleteCourse(Long id);
}