package com.core.java;

import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student>{
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", age=" + age + "]";
	}
	int marks;
	int age;
	Student(int marks,int age){
		this.marks = marks;
		this.age = age;
	}
	@Override
	public int compareTo(Student that) {
		return this.age >that.age ? 1 : -1;
	}
	public static void main(String[] args) {
		Student s1 = new Student(100,10);
		Student s2 = new Student(50,45);
		Student s3 = new Student(2,2);
		Student ss = new Student(1,1);
		Student arr[] = {s1,s2,s3,ss};
		Comparator<Student> com = (o1,o2) -> Integer.compare(o1.age, o2.age) ;
		Arrays.sort(arr,com);
		for(Student s : arr ) {
			System.out.println(s);
		}
	}
}
