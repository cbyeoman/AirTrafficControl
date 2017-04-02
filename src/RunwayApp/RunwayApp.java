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
        Runway theRunway = new Runway();
      theRunway.addPlane("Delta 1023", 560);
      theRunway.addPlane("Delta 1023", 460);

      System.out.println("Runway 101 has the following time schedule: \n");

      theRunway.displayPlanes();
      System.out.println();
      System.out.println("Runway 101 has the following time schedule: \n");
      theRunway.insertionSort();
      theRunway.displayPlanes();
    }
    
}
