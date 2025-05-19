package com.pluralsight;

import java.awt.*;

public class Turtle implements IMovable {
    private String name;
    private Point currentLocation;
    private int power;
    
    public Turtle(String name) {
        this.name = name;
        this.currentLocation = new Point(25, 25);
        this.power = 100;
    }
    // getters and setters not shown
    public Point move(int xUnits, int yUnits) {
    // the turtle moves the number of units specified in
    // the direction specified
        currentLocation.setX(currentLocation.getX() + xUnits);
        currentLocation.setY(currentLocation.getY() + yUnits);
        return currentLocation;
    }
    public void goHome() {
        this.currentLocation = new Point(25, 25);
    }
}
