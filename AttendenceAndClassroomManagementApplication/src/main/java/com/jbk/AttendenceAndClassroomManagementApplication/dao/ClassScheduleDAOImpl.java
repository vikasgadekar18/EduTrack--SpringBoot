package com.jbk.AttendenceAndClassroomManagementApplication.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.AttendenceAndClassroomManagementApplication.entity.ClassSchedule;

import java.util.List;

@Repository
public class ClassScheduleDAOImpl implements ClassScheduleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<ClassSchedule> getAllClassSchedules() {
		Session session = null;
		List<ClassSchedule> classSchedules;
		try {
			session = sessionFactory.openSession();
			classSchedules = session.createQuery("FROM ClassSchedule", ClassSchedule.class).getResultList();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return classSchedules;
	}

	@Override
	public ClassSchedule getClassScheduleById(Long id) {
		Session session = null;
		ClassSchedule classSchedule = null;
		try {
			session = sessionFactory.openSession();
			classSchedule = session.get(ClassSchedule.class, id);
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return classSchedule;
	}

	@Override
	public void saveClassSchedule(ClassSchedule classSchedule) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(classSchedule);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void deleteClassSchedule(Long id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			ClassSchedule classSchedule = session.get(ClassSchedule.class, id);
			session.remove(classSchedule);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}
}