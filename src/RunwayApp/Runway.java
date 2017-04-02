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
public class Runway {
  final int MAX_SLOTS = 100;
      Plane a[];
      int numPlanes = 0;
      
// -------------------------------------------------------------
   public Runway()  // constructor
      {
         a = new Plane[MAX_SLOTS];
      }


   public void addPlane(String name, int time){  
      // will impliment check time 
     a[numPlanes++] = new Plane(name, time);
      }  

   public void displayPlanes(){  
        int i;
      for(i=0; i<numPlanes; i++)    
         {
         
            System.out.println(a[i]); 

         }
   
}
   public void insertionSort()
      {
      int in, out;

      for(out=1; out<numPlanes; out++)     // out is dividing line
         {
         Plane temp = a[out];            // remove marked item
         in = out;                      // start shifts at out
         while(in>0 && a[in-1].getTime() >= temp.getTime()) // until one is smaller,
            {
            a[in] = a[in-1];            // shift item to right
            --in;                       // go left one position
            }
         a[in] = temp;                  // insert marked item
         }  // end for
      }  // end insertionSort()
}