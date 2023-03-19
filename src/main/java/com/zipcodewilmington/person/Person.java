package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int footSize;
    private int height;
    private String gender;

    public void setFootSize(int footSize) {

        this.footSize = footSize;
    }

    public int getFootSize() {

        return footSize;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight(){
        return height;
    }

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {

        this.age = age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
