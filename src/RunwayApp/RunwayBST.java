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
class RunwayBST implements Runway // runway BST
{

    final int MAX_SLOTS = 1000;
    final int TIME_INTERVAL = 3;
    int numPlanes = 0;
    // using tree class
    Tree theTree = new Tree();

    // -------------------------------------------------------------
    public RunwayBST() // constructor
    {
        numPlanes++;
        theTree.insert(1, new Plane("Delta Inaugural Flight", 1));
        System.out.println("added Delta Inaugural Flight @ time 1");

    }

    public String addPlane(String name, int time) {
        if (theTree.insert(time, new Plane("Delta Inaugural Flight", time))) {
            //System.out.println("added plane @ time " + time);
            return "added plane @ time " + time;

        } else {
            //System.out.println("time conflict @ time " + time);
            return "time conflict @ time " + time;

        }
    }

    public void displayPlanes() {
        theTree.displayTree();

    }

    // -------------------------------------------------------------
} // end class RunwayBST
