/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_490hw_1;

/**
 *
 * @author Seth
 * @author Eli
 */


public class CS_490HW_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MinHeap myHeap = new MinHeap(5);
        CreateThread myCreation = new CreateThread();
        ConsumeThread myConsumption = new ConsumeThread();
        ConsumeThread myConsumption1 = new ConsumeThread();
        for(int i = 0; i < 5; i++){
            myCreation.run(myHeap);
        }
        while(true) {
            if(myHeap.length() != 1){
                myConsumption.run(myHeap);
                myConsumption1.run(myHeap);
            }
            else{
               break;
            }
        }
    }
    
}
