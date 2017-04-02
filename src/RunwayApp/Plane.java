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
public class Plane {
    public String name;   
   public int time; 
// -------------------------------------------------------------
   public Plane(String n, int t)  // constructor
      {
      name = n;
      time = t;
      }

    @Override
  public String toString() {

    return name + " @ time "  + time;
  }

   public int getTime(){  
      
      return time;
      }  
}
