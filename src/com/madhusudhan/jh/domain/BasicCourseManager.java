package com.madhusudhan.jh.domain;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by головченко on 15.05.2016.
 */
public class BasicCourseManager {
    public void persist(Course course){
        Session session = SessionFactory.getSession();
        session.beginTransaction();
        session.save(course);
        session.getTransaction().commit();
    }

    public Course find(CoursePK coursePK){
        Session session = SessionFactory.getSession();
        Course cource = (Course)session.load(CoursePK.class, coursePK);
        session.getTransaction().commit();

        return  cource;
    }

    public void findAll(){
        Session session = SessionFactory.getSession();
        session.beginTransaction();
        List<Course> courseList = session.createQuery("from Course").list();
        session.getTransaction().commit();
        System.out.println("All Cources:"+ courseList);

    }
}
