package edu.unl.raikes.day21;

/**
 * This is ZombieInvasion.java, packaged within edu.unl.raikes.day21.
 */
public class ZombieInvasion {

    /**
     * The main method.
     *
     * @param args This program does not accept any arguments.
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        //this is an object - a real thing made from the blueprint
        Town ourTown = new Town("SteveVille", "Steve Cooper", 0,0);
     
        //This is another town - bettendorf
        Town bettendorf = new Town("Bettendorf", "Paula Ortez", -0.5, 1.5);
        
        double distanceToBettendorf = ourTown.distanceApart(bettendorf);
        
        System.out.println("Aaaaahhh!!! Zombie invasion! ");
        System.out.println("This is " + ourTown.getMayorName() + " at " + ourTown.getName() + " central command. We need to warn our neighbors.");
        System.out.println();
        System.out.println(bettendorf.getName() + " is " + distanceToBettendorf + " miles away");
=======
        // this is an object - a real thing made from the blueprint
        Town ourTown = new Town("Steveville", "Steve Cooper", 0, 0);

        // this is another object
        Town bettendorf = new Town("Bettendorf", "Paula Ortez", -.5, 1.5);
        System.out.println("Aaaaahhh!!! Zombie invasion! ");
>>>>>>> 4ad96a718ed1f8910e0c4e945f40d5370fb8e45c

        ourTown.setMayorName("Val");
        System.out.println("This is " + ourTown.getMayorName() + " at " + ourTown.getName()
                + " central command. We need to warn our neighbors.");

        // non static version
        double distanceToBettendorf = ourTown.distance(bettendorf);

        System.out.println(bettendorf.getName() + " is " + distanceToBettendorf + " miles away.");
    }

}
