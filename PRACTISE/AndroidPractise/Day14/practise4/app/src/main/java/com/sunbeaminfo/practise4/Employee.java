package com.sunbeaminfo.practise4;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName="employee")
public class Employee implements Serializable{

    @PrimaryKey
    private int empno;

    private String name;

    private double mobile;

    public Employee() {
    }

    public Employee(int empno, String name, double mobile) {
        this.empno = empno;
        this.name = name;
        this.mobile = mobile;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMobile() {
        return mobile;
    }

    public void setMobile(double mobile) {
        this.mobile = mobile;
    }
}
