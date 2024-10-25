package edu.unl.raikes.day21;

public class ZombieInvasion {
    
    public static void main(String[] args) {
        Town ourTown = new Town("SteveVille", "Steve Cooper", 0,0);
     
        //This is another town - bettendorf
        Point bLocation = new Point(-0.5, 1.5);
        Town bettendorf = new Town("Bettendorf", "Paula Ortez", bLocation);
        
        double distanceToBettendorf = ourTown.distance(bettendorf);
        
        System.out.println("Aaaaahhh!!! Zombie invasion! ");
        System.out.println("This is " + ourTown.getMayorName() + " at " + ourTown.getName() + " central command. We need to warn our neighbors.");
        System.out.println();
        System.out.println(bettendorf.getName() + " is " + distanceToBettendorf + " miles away");
        // this is an object - a real thing made from the blueprint

        System.out.println(bettendorf);
        System.out.println(ourTown);
    }

}
