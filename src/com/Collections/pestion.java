package com.Collections;

public class pestion implements Comparable<pestion> {
    private String name;
    private int age;

    public pestion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public pestion() {
    }

    @Override
    public String toString() {
        return "pestion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public int compareTo(pestion o) {
        //return 0;
        return o.getAge()-this.getAge();
    }
}
