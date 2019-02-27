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
    public void run(MinHeap heap){
        try {
            while(true){
                Node myNode = new Node();
                heap.insert(myNode);
                Thread.sleep(1000);
                throw new InterruptedException("oh no create is bad");
            }
        }
        catch(InterruptedException exception) {
            // cleanup
        }
    }

}
