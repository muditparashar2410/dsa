package com.core.java;


class Person implements Comparable<Person> {
    private String name;
    private int age;

    // constructor, getters, and setters

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
 

public class Interface_Demo {
	Person p = new Person();
}
