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
public class MinHeap {
    private Node[] nodeHeap;
    private int size;
    private int maxSize;
    
    private static final int FRONT = 1;
    
    public MinHeap(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        nodeHeap = new Node[this.maxSize + 1];
        nodeHeap[0] = new Node();
    }
    
    public int length(){
        return size;
    }
    
    private int parent(int pos){
        return pos/2;
    }
    
    private int leftChild(int pos){
        return(2*pos);
    }
    
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
    
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
    
    private void swap(int fpos, int spos){
        Node tmp;
        tmp = nodeHeap[fpos];
        nodeHeap[fpos] = nodeHeap[spos];
        nodeHeap[spos] = tmp;
    }
    
    // Function to heapify the node at pos 
    private void minHeapify(int pos)
    {
        // If the node is a non-leaf node and has greater 
        // priority than any of its children 
        try{
            if(!isLeaf(pos)){
                if(nodeHeap[pos].Priority > nodeHeap[leftChild(pos)].Priority||nodeHeap[pos].Priority > nodeHeap[rightChild(pos)].Priority){  
                    // Swap with the left child and heapify 
                    // the left child 
                    if (nodeHeap[leftChild(pos)].Priority < nodeHeap[rightChild(pos)].Priority){
                        swap(pos, leftChild(pos));
                        minHeapify(leftChild(pos));
                    }  
                    // Swap with the right child and heapify  
                    // the right child 
                    else {
                        swap(pos, rightChild(pos));
                        minHeapify(rightChild(pos));
                    } 
                }
            }
        }
        catch(NullPointerException e){
            
        }
    }
    
    public void insert(Node element){
        element = new Node();
        nodeHeap[++size] = element;
        int current = size;
        
        while (nodeHeap[current].Priority < nodeHeap[parent(current)].Priority){
            swap(current, parent(current));
            current = parent(current);
        }
    }
    
    // Function to build the min heap using  
    // the minHeapify 
    public void minHeap() 
    { 
        for (int pos = (size / 2); pos >= 1; pos--) { 
            minHeapify(pos); 
        } 
    } 
    
    // Function to remove and return the minimum 
    // element from the he
    public Node remove() 
    { 
        Node popped = nodeHeap[FRONT]; 
        nodeHeap[FRONT] = nodeHeap[size--]; 
        minHeapify(FRONT); 
        return popped; 
    } 
}
