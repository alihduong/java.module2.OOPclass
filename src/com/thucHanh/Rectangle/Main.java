package com.thucHanh.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle: " + rectangle.display());
        System.out.println("Perimeter of Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of Rectangle: "+ rectangle.getArea());
    }
}
