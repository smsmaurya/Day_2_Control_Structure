package com.bridgeLabz.day2practiceProblems;

import java.util.Scanner;

public class ReverseNumberWithWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int revNum = 0;
        while(num>0){
            revNum = (revNum*10)+(num%10);
            num = num/10;
        }
        System.out.println("Reverse of the given number is : "+revNum);
    }
}
