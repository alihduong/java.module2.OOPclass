package com.Fan;

public class Fan {
    int speed;
    boolean turnOn;
    double radius;
    String color;

    public Fan() {
        speed = 1;
        turnOn = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean turnOn, double radius, String color) {
        this.speed = speed;
        this.turnOn = turnOn;
        this.radius = radius;
        this.color = color;
    }

    public String getSpeed() {
        if (this.speed == 1){
            return "Slow";
        }else if (this.speed==2){
            return "Medium";
        }else {
            return "Fast";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String isTurnOn() {
        if (this.turnOn){
            return "Fan is On";
        }else{
            return "Fan in Off";
        }
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + getSpeed() +
                ", turnOn=" + isTurnOn() +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
