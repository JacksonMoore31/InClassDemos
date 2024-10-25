package edu.unl.raikes.day21;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double distance(Point otherPoint) {
       
        return distance(this, otherPoint);
    }

    public static double distance(Point firstPoint, Point otherPoint) {
        double deltaX = otherPoint.getX() - firstPoint.getX();
        double deltaY = otherPoint.getY() - firstPoint.getY();

        double squares = Math.pow(deltaX, 2) + Math.pow(deltaX, 2);
        return Math.sqrt(squares);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "[x=" + this.x + ", y=" + this.y + "]";
    }

}
