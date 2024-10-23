   


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