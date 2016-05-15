package com.madhusudhan.jh.domain.showroom;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by головченко on 15.05.2016.
 */
@Entity(name="SHOWROOM_LIST_ANN")
@Table(name="SHOWROOM_LIST_ANN")
public class Showroom {
    private int id = 0;
    private List<Car> cars = null;
    private String manager = null;
    private String location = null;

    @Id
    @Column(name="SHOWROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany
    @JoinColumn(name="SHOWROOM_ID")
    @Cascade(CascadeType.ALL)
    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Showroom showroom = (Showroom) o;

        if (id != showroom.id) return false;
        if (cars != null ? !cars.equals(showroom.cars) : showroom.cars != null) return false;
        if (location != null ? !location.equals(showroom.location) : showroom.location != null) return false;
        if (manager != null ? !manager.equals(showroom.manager) : showroom.manager != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cars != null ? cars.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
