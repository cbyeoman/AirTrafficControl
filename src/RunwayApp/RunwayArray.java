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
public class RunwayArray {
    final int MAX_SLOTS = 100;
    final int TIME_INTERVAL = 3;
    Plane a[];
    int numPlanes = 0;


    // -------------------------------------------------------------
    public RunwayArray() // constructor
        {
            a = new Plane[MAX_SLOTS];
            a[numPlanes++] = new Plane("Delta Inaugural Flight", 1);
            System.out.println("added Delta Inaugural Flight @ time 1");
        }


    public void addPlane(String name, int time) {


        if (binarySearchInterval(a, time)) {
            a[numPlanes++] = new Plane(name, time);
            System.out.println("added plane @ time " + time);
            insertionSort();
            //displayPlanes();
        } else {
            System.out.println("time conflict @ time " + time);

        }
    }




    public void displayPlanes() {
        int i;
        for (i = 0; i < numPlanes; i++) {

            System.out.println(a[i]);

        }

    }


    // from Drake book
    // heavily modified to check for time interval
    public boolean binarySearchInterval(Plane[] data, int target) {
        int bottom = 0;
        int top = numPlanes - 1;
        int found = 0;
        int midpoint = 0;
        while (bottom <= top) {

            midpoint = (top + bottom) / 2;
            int midpointTime = data[midpoint].getTime();
            if (target < midpointTime) {
                top = midpoint - 1;
            } else if (target == midpointTime) {
                // if target is found, there is for sure a time conflict, so return
                return false;
            } else {
                bottom = midpoint + 1;
            }
        }

        // we get the time that is just before  the target
        found = top;

        //System.out.println("test " + a[found].getTime()); 

        // we check if there is a time interval conflict.
        // if the time found is the last time in the array
        if (a[found].getTime() == a[numPlanes - 1].getTime()) {
            if (Math.abs(target - a[found].getTime()) >= TIME_INTERVAL) {
                return true;
            }

        }         // if the time found is not the last time in the array
         else if (Math.abs(a[found].getTime() - target) >= TIME_INTERVAL && Math.abs(a[found + 1].getTime() - target) >= TIME_INTERVAL) {
            return true;
        }

        return false;


    }



    //from Lafore book
    public void insertionSort() {
            int in , out;

            for (out = 1; out < numPlanes; out++) // out is dividing line
            {
                Plane temp = a[out]; // remove marked item
                in = out; // start shifts at out
                while ( in > 0 && a[ in -1].getTime() >= temp.getTime()) // until one is smaller,
                {
                    a[ in ] = a[ in -1]; // shift item to right
                    -- in ; // go left one position
                }
                a[ in ] = temp; // insert marked item
            } // end for
        } // end insertionSort()
}
