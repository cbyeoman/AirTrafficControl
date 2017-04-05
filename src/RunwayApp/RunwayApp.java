/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunwayApp;

/**
 *
 * @author Christopher
 */
public class RunwayApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Runway Array");
            RunwayArray theRunway = new RunwayArray();


            theRunway.addPlane("Delta 1023", 2);

            theRunway.addPlane("Delta 1023", 4);

            theRunway.addPlane("Delta 1023", 3);


            theRunway.addPlane("Delta 1023", 500);

            theRunway.addPlane("Delta 1023", 498);

            theRunway.addPlane("Delta 1023", 4);


            theRunway.addPlane("Delta 1023", 495);
            System.out.println("Runway Array has the following time schedule: ");
            theRunway.displayPlanes();

            System.out.println();
            System.out.println("New Runway Hashtable");
                RunwayHashTable theRunway2 = new RunwayHashTable();
         



            theRunway2.addPlane("Delta 1023", 492);
            theRunway2.addPlane("Delta 1023", 494);

            System.out.println("Runway Hashtable has the following time schedule: ");

            theRunway2.displayPlanes();

            System.out.println();

            System.out.println("New Runway BST");
               RunwayBST theRunway3 = new RunwayBST();


            theRunway3.addPlane("Delta 1023", 4);

            theRunway3.addPlane("Delta 1023", 3);


            theRunway3.addPlane("Delta 1023", 500);

            theRunway3.addPlane("Delta 1023", 498);

            theRunway3.addPlane("Delta 1023", 4);


            theRunway3.addPlane("Delta 1023", 495);

            System.out.println("Runway BST has the following time schedule: ");

            theRunway3.displayPlanes();




        } // end main()
    
}
