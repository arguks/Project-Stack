
package com.krisstelargueta.project_stack;

import java.util.EmptyStackException;

public class Stack {
    private int arr [];
    private int top;
    
    
    public Stack (int size){
        arr = new int [size];
        top = -1;
    }
    
    public void push (int val){
        if(isFull()){
          throw new ArrayIndexOutOfBoundsException();  
        }
        top++;
        arr[top] = val;
    }
    
    public int pop (){
        if(isEmpty()){
           throw new EmptyStackException(); 
        } 
        int returnVal = arr[top];
            arr[top] = 0;
            top--;
            return returnVal;
    }
    
    public int peek (){
        if(isEmpty()){
           throw new EmptyStackException(); 
        } 
        return arr[top];
    }
    
    public Boolean isEmpty(){
        if(top == -1){
            return true;
        } else { return false;}
    }
    
    public Boolean isFull(){
        if(top == arr.length){
            return true;
        } else { return false;}
    }
    
    public void print(){
        System.out.print("[");
        for(int i = 0; i < arr.length; i++ ){
            if(i == arr.length -1){
                System.out.print(pop() + "]");
            } else {
                System.out.print(pop() + ", ");
            }
        }
    }
}
