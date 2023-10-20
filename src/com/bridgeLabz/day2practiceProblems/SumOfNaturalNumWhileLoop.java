package com.bridgeLabz.day2practiceProblems;

import java.util.Scanner;

public class SumOfNaturalNumWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for adding natural number");
        int num =  sc.nextInt();
        int sum = 0;
        //int i=1;
        while(num>=1){
            /* if(i!=num)
            System.out.print(i+"+");
            else
                System.out.print(i); */
            sum +=num;
            num--;
        }
        System.out.println(" The sum of natural number is :"+sum);
    }
}
