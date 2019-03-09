/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_490hw_1;

/**
 *
 * @author Seth
 */
public class CreateThread implements Runnable {
    Node myNode;
    Object monitor;
    public void CreateThread(){
        
    }
    
    public void run(MinHeap heap){
        try {
                myNode = new Node();
                heap.monitorInsert(myNode);
                Thread.sleep(000);
//                monitor.notify();
                ///throw new InterruptedException("oh no create is bad");
        }
        catch(InterruptedException exception) {
            // cleanup
        }
    }

}
