package com.sunbeaminfo.practise5;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "employee")
public class Employee {
    @PrimaryKey
    private int empno;

    private String name;

    private String mobile;

    public Employee() {
    }

    public Employee(int empno, String name, String mobile) {
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
