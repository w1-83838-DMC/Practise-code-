package com.sunbeam.spdata03.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="MEETING")
public class Meeting {
    @Id
    @Column(name="id")
    private int meetno;
    private String subject;
    @Temporal(TemporalType.TIMESTAMP)
    private Date meetDate;
    @ManyToMany(mappedBy="meetList")
    private List<Emp> empList;
    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public Meeting() {
    }

    public Meeting(int meetno, String subject, Date meetDate) {
        this.meetno = meetno;
        this.subject = subject;
        this.meetDate = meetDate;
    }

    public int getMeetno() {
        return meetno;
    }

    public void setMeetno(int meetno) {
        this.meetno = meetno;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(Date meetDate) {
        this.meetDate = meetDate;
    }

    @Override
    public String toString() {
        return "Meeting [meetno=" + meetno + ", subject=" + subject + ", meetDate=" + meetDate + "]";
    }


    
    

    

    
}
