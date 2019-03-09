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
public class ConsumeThread implements Runnable {
    Node myNode;
    Object monitor;
    
    public void run(MinHeap heap){
        try {
            // do work
//            monitor.wait();
            if (!heap.isHeaping()){
                myNode = heap.remove();
                myNode.execute();
                //throw new InterruptedException("oh no consume is bad");
            }
            else{
                throw new InterruptedException();
            }
        }
        catch(InterruptedException exception) {
            // stop immediately and go home
            
        }
    }
}
