package com.sunbeam.spdata03.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EMPADDRESS")
public class Address {
    @Id
    private int empid;
    private String addr;
    private String country;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Emp emp;


    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public Address() {
    }

    public Address(int empid, String addr, String country) {
        this.empid = empid;
        this.addr = addr;
        this.country = country;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [empid=" + empid + ", addr=" + addr + ", country=" + country + "]";
    }

    

    

    

    

}
