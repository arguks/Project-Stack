package com.krisstelargueta.project_stack;

import java.util.Scanner;

public class Project_Stack {

    public static void main(String[] args) {
        Stack stack;
        
        System.out.println("Enter the size of the stack you would like to create");
        
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        stack = new Stack (size);
        
        for(int i = 0; i < size; i++ ){
            System.out.println("Please enter a value to enter into the stack");
            int val = scan.nextInt();
            stack.push(val);
        }
        
        System.out.println("These are all the values in the stack");
        stack.print();
    }
}