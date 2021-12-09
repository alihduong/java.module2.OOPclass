package com.QuadraticEquation;

public class QuadraticEquation {
    private double numA;
    private double numB;
    private double numC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    public double getNumC() {
        return numC;
    }

    public double getDelta() {
        return (Math.pow(this.numB, 2) - 4 * this.numA * this.numC);
    }

    public double getRoot() {
        return (-this.numC / this.numB);
    }

    public double getRoot1() {
        return ((-this.numB + Math.sqrt(getDelta())) / 2 * this.numA);
    }

    public double getRoot2() {
        return ((-this.numB - Math.sqrt(getDelta())) / 2 * this.numA);
    }

    public void results() {
        if (this.numA == 0 && this.numB == 0 && this.numC == 0) {
            System.out.println("Equation countless Root");
        }else {
            if (this.getDelta() < 0) {
                System.out.println("Equation don't Root");
            }else if (this.getDelta()==0){
                System.out.println("Root of equation = "+ (-this.numB/2/this.numA));
            }else{
                System.out.println("Equation have 2 root = "+this.getRoot1() +" and "+ this.getRoot2());
            }
        }
    }
}
