package com.core.java;

public class ObjectClassOverridenMethod {
    public static void main(String[] args) {
        String a = new String("mudit");
        String b = "mudit";
        if(a==b){
            System.out.println(("equal according to =="));
        }else{
            System.out.println(("not equal accorind to =="));
        }
        if(a.equals(b)){
            System.out.println(("equal according to equals"));
        }else{
            System.out.println((" not equal accorind to equals"));
        }



    }
}
