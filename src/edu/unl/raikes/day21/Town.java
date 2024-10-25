package edu.unl.raikes.day21;

public class Town {
    private String name;
    private String mayorName;
    private Point location;

    public Town(String name, String mayorName, double x, double y) {
        this.name = name;
        this.mayorName = mayorName;
        this.location = new Point(x, y);
//INSTEAD THIS(NAME, MAYORNAME, NEW POINT(X, Y));
    }

    public Town(String name, String mayorName,Point location) {
        this.name = name;
        this.mayorName = mayorName;
        this.location = location;
    }
    
    public double distance(Town otherTown) {
        return this.location.distance(otherTown.getLocation());
    }

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
        this.mayorName = mayorName;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "I'm a town called " + this.name + " and my mayor is the honorable " + this.mayorName
                + ". I am locatied at " + this.location.toString();
    }
}
