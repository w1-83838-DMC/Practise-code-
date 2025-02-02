package com.sunbeam;

public class BoxImpl implements Box{
    private int length;
    private int breadth;
    private int height;
    public BoxImpl() {
    }
    public BoxImpl(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int calVolume() {
        return this.length*this.breadth*this.height;

    }

    
    

}
