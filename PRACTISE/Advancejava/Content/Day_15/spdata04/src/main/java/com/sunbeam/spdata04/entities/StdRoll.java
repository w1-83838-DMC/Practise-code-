package com.sunbeam.spdata04.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

// compoeite primary Key
@Embeddable
public class StdRoll implements Serializable{
    @Column
    private int std;
    @Column
    private int roll;
   
    public StdRoll() {
    }

    public StdRoll(int std, int roll) {
        this.std = std;
        this.roll = roll;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StdRoll [std=" + std + ", roll=" + roll + "]";
    }

    
    

    
    

}
