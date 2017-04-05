/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RunwayApp;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Christopher
 */
public class RunwayHashTable {
     final int MAX_SLOTS = 100;
    final int TIME_INTERVAL = 3;
    int numPlanes = 0;
    // using built-in Java hash table
    Hashtable < Integer, Plane > hashtable =
        new Hashtable < Integer, Plane > ();

    // -------------------------------------------------------------
    public RunwayHashTable() // constructor
        {
            numPlanes++;
            hashtable.put(1, new Plane("Delta Inaugural Flight", 1));
            System.out.println("added Delta Inaugural Flight @ time 1");

        }


    public void addPlane(String name, int time) {


        int minKey = 1;
        int maxKey = 10000;

        for (Integer key: hashtable.keySet()) {
            //System.out.println("The Hashtable contains key "+ key);


            if (key < time && key > minKey) {
                minKey = key;
            } else if (key > time && key < maxKey) {
                maxKey = key;
            }

        }

        //System.out.println("The Hashtable smallest "+ minKey);
        //System.out.println("The Hashtable largest "+ maxKey);


        // if the time found is not the last time in the array
        if (Math.abs(maxKey - time) >= TIME_INTERVAL && Math.abs(minKey - time) >= TIME_INTERVAL) {
            hashtable.put(time, new Plane(name, time));
            numPlanes++;
            System.out.println("added plane @ time " + time);
            // displayPlanes();

        } else {
            System.out.println("time conflict @ time " + time);
        }


    }



    public void displayPlanes() {
        for (Map.Entry entry: hashtable.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
