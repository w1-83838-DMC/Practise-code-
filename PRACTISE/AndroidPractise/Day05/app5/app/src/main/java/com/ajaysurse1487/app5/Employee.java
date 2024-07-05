package com.ajaysurse1487.app5;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private String mobile;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String mobile, int salary) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", salary=" + salary +
                '}';
    }
}
