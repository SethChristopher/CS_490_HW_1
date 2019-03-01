/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs_490hw_1;
import java.util.Random;
        
/**
 *
 * @author Seth
 */
public class Node {
    Random myRand = new Random();
    int processID = myRand.nextInt(5000);
    int Priority = myRand.nextInt(20);
    int timeSlice = 3000;
    
    public void Node(){
        this.processID = 1123;
        this.Priority = 0;
        this.timeSlice = 3000;
    }
    
    
    int getprocessID(){
      return this.processID;  
    }
    
    int getPriority(){
        return this.Priority;
    }
    
    int getTimeSlice(){
        return this.timeSlice;
    }
    
    void setProcessID(int PID){
        this.processID = PID;
    }
    
    void setPriority(int PRI){
        this.Priority = PRI;
    }
    
    void setTimeSlice(int TIME){
        this.timeSlice = TIME;
    }
    
    void execute() throws InterruptedException{
        Thread.sleep(this.timeSlice);
        this.printExecutionReport();
    }
    
    void printExecutionReport(){
         System.out.println ("Process ID: " + this.processID + " Priority: " + this.Priority ); //TODO Print Time
    }
    
}
