package com.HaspMap;

import java.util.Objects;

public class pesion {
    private String name;
    private int age;

    public pesion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pesion pesion = (pesion) o;
        return age == pesion.age && Objects.equals(name, pesion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "pesion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public pesion() {
    }
}
