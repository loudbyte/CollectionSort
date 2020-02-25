package com.epam.oranization.emploee;

public abstract class Emploee implements EmploeeAction, Comparable<Emploee> {
    private String name;
    private int id;
    private int salary;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Emploee o) {
        return this.id - o.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getSalary() {
        return salary;
    }

}