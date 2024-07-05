package com.sunbeam.boot07scope;

public class BoxImpl implements Box {
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
    @Override
    public int getLength() {
        return length;
    }
    @Override
    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public int getBreadth() {
        return breadth;
    }
    @Override
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "BoxImpl [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
    }

    @Override
    public int calVolume()
    {
        return this.length*this.breadth*this.height;
    }

    @Override
    public void setBeanName(String name)
    {
        System.out.println("Beans created :"+ name);
    }

    

}
