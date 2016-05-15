package com.madhusudhan.jh.domain.showroom;

import javax.persistence.*;

/**
 * Created by головченко on 15.05.2016.
 */
@Entity(name="CAR_LIST_ANN")
@Table(name="CAR_LIST_ANN")
public class Car {
    private int id;
    private String name = null;
    private String color = null;

    public Car(){}

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CAR_ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (!color.equals(car.color)) return false;
        if (!name.equals(car.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }
}
