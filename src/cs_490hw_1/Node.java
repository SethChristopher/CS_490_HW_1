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
public class Node {
    private int processID;
    private int Priority;
    private int timeSlice;
    
    public void Node(int PID, int PRI, int TIME){
        this.processID = PID;
        this.Priority = PRI;
        this.timeSlice = TIME;
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
    }
    
}
