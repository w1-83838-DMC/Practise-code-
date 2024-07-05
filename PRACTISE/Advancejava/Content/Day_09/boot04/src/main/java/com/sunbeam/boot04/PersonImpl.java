package com.sunbeam.boot04;

public class PersonImpl implements Person{
    private String name;
    private int age;
    
    public PersonImpl() {
    }

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonImpl [name=" + name + ", age=" + age + "]";
    }

    

}
