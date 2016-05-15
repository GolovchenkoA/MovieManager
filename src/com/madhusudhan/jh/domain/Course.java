package com.madhusudhan.jh.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by головченко on 15.05.2016.
 */
@Entity
@Table(name = "COURSE_ANNOTATION")
public class Course {
    private CoursePK id = null;
    private int totalStudents = 0;
    private int registeredStudents = 0;

    @Id
    public CoursePK getId() {
        return id;
    }

    public void setId(CoursePK id) {
        this.id = id;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public int getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(int registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (registeredStudents != course.registeredStudents) return false;
        if (totalStudents != course.totalStudents) return false;
        if (!id.equals(course.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + totalStudents;
        result = 31 * result + registeredStudents;
        return result;
    }
}
