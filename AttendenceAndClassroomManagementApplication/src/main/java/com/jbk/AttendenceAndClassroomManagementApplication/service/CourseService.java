package com.jbk.AttendenceAndClassroomManagementApplication.service;


import java.util.List;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.Course;

public interface CourseService {

    List<Course> getAllCourses();

    Course getCourseById(Long id);

    void saveCourse(Course course);

    void deleteCourse(Long id);
}