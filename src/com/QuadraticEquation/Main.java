package com.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax2 + bx + c = 0");
        System.out.print("Enter number A: ");
        double numA = scanner.nextDouble();
        System.out.print("Enter number B: ");
        double numB = scanner.nextDouble();
        System.out.print("Enter number C: ");
        double numC = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(numA,numB,numC);
        equation.results();
    }
}
