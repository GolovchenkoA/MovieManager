package com.madhusudhan.jh.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by головченко on 15.05.2016.
 */
@Embeddable
public class CoursePK implements Serializable{
    private String tutor = null;
    private String title = null;

    public CoursePK(){};

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursePK coursePK = (CoursePK) o;

        if (!title.equals(coursePK.title)) return false;
        if (!tutor.equals(coursePK.tutor)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tutor.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }
}
