package com.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"Yellow");
        System.out.println(fan1);
        Fan fan2 = new Fan(2,false,5,"blue");
        System.out.println(fan2);
        Fan fan3 = new Fan();
        System.out.println(fan3.toString());
    }
}
