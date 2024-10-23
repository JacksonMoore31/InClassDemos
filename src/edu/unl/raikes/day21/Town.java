package edu.unl.raikes.day21;

//This is a class - a blueprint
public class Town {
    private String name;
    private String mayorName;
    private double x;
    private double y;
    boolean isElectionSeason = false;

    public Town(String name, String mayorName, double x, double y) {
        this.name = name;
        this.mayorName = mayorName;
        this.x = x;
        this.y = y;
        
        System.out.println("The next town in our area is " + name);
        System.out.println("The mayor of this town is "+ mayorName);
        System.out.println();
        
    }
    //Static functions belong to blueprints while non-static belongs to objects
    //Non-static because it relies on Town data - we need x and y to do this work
    public double distanceApart(Town otherTown) {
        
        double deltaX = otherTown.x - this.x;
        double deltaY = otherTown.y - this.y;
        double squares = Math.pow(deltaX, 2) + Math.pow(deltaY, 2);
        double distance = Math.sqrt(squares);
        
        return distance;
    }
    
    //All of the getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMayorName() {
        return mayorName;
    }
    public void setMayorName(String mayorName) {
        if (isElectionSeason) {
        this.mayorName = mayorName;
        }
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
    
}
