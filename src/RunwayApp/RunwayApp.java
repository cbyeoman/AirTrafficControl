/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunwayApp;


import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Christopher
 */
class RunwayApp {

    public static void runwayTime(String name, Runway runway) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i < 1000; i++) {
            

            int randomNum = ThreadLocalRandom.current().nextInt(1, 3000 + 1);
            
            runway.addPlane("Delta " + i, randomNum);

        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("execution time for " + name + " = " + totalTime + " milliseconds");

    }

    public static void main(String[] args) {

        System.out.println("Runway Array");

        RunwayArray theRunway = new RunwayArray();

        System.out.println(theRunway.addPlane("Delta 1023", 2));

        System.out.println(theRunway.addPlane("Delta 1023", 4));
        System.out.println(theRunway.addPlane("Delta 1023", 3));
        System.out.println(theRunway.addPlane("Delta 1023", 500));
        System.out.println(theRunway.addPlane("Delta 1023", 498));
        System.out.println(theRunway.addPlane("Delta 1023", 496));
        System.out.println(theRunway.addPlane("Delta 1023", 4));

        System.out.println("Runway Array has the following time schedule: ");
        theRunway.displayPlanes();

        System.out.println("starting time test for Runway Array");
        runwayTime("Runway Array", theRunway);
        theRunway.displayPlanes();
        
        System.out.println();

        System.out.println("New Runway Hashtable");

        RunwayHashTable theRunway2 = new RunwayHashTable();

        System.out.println(theRunway2.addPlane("Delta 1023", 2));

        System.out.println(theRunway2.addPlane("Delta 1023", 4));
        System.out.println(theRunway2.addPlane("Delta 1023", 3));
        System.out.println(theRunway2.addPlane("Delta 1023", 500));
        System.out.println(theRunway2.addPlane("Delta 1023", 498));
        System.out.println(theRunway2.addPlane("Delta 1023", 496));

        System.out.println(theRunway2.addPlane("Delta 1023", 4));

        System.out.println("Runway Hashtable has the following time schedule: ");

        theRunway2.displayPlanes();
        
        System.out.println("starting time test for Runway Hash Table");
        runwayTime("Runway Hash Table", theRunway2);
        theRunway2.displayPlanes();

        System.out.println();

        System.out.println("New Runway BST");

        RunwayBST theRunway3 = new RunwayBST();

        System.out.println(theRunway3.addPlane("Delta 1023", 2));

        System.out.println(theRunway3.addPlane("Delta 1023", 4));
        System.out.println(theRunway3.addPlane("Delta 1023", 3));
        System.out.println(theRunway3.addPlane("Delta 1023", 500));
        System.out.println(theRunway3.addPlane("Delta 1023", 498));
        System.out.println(theRunway3.addPlane("Delta 1023", 496));
        System.out.println(theRunway3.addPlane("Delta 1023", 4));

        System.out.println("Runway BST has the following time schedule: ");
        theRunway3.displayPlanes();

        System.out.println("starting time test for Runway Binary Search Tree");
        runwayTime("Runway Binary Search Tree", theRunway3);
       

    } // end main()
} // end class RunwayApp