package com.sunbeam.spdata03.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Emp {
    @Id
    private int empno;
    private String ename;
    private double sal;

    @ManyToMany
    @JoinTable(name="EMPMEETING",
    joinColumns ={@JoinColumn(name="empid")},
    inverseJoinColumns = {@JoinColumn(name="meetingid")})
    private List<Meeting> meetList;

    @OneToOne(mappedBy="emp")
    private Address address;

    @ManyToOne
    @JoinColumn(name="deptno")
    private Dept dept;


    public Dept getDept() {
        return dept;
    }


    public void setDept(Dept dept) {
        this.dept = dept;
    }


    public Address getAddress() {
        return address;
    }

    
    public void setAddress(Address address) {
        this.address = address;
    }

    public Emp() {
    }

    public Emp(int empno, String ename, double sal) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
    }

    public List<Meeting> getMeetList() {
        return meetList;
    }

    public void setMeetList(List<Meeting> meetList) {
        this.meetList = meetList;
    }

    
    



}
