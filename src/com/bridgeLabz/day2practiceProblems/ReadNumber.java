package com.bridgeLabz.day2practiceProblems;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number==1) {
            System.out.println("unit");
        } else if (number==10) {
            System.out.println("ten");
        } else if (number==100) {
            System.out.println("Hundred");
        } else if (number==1000) {
            System.out.println("Thousand");
        } else if (number==10000) {
            System.out.println("Ten Thousand");
        } else if (number==100000) {
            System.out.println("Hundred Thousand");
        } else if (number==1000000) {
            System.out.println("ONe Million");
        }
        else{
            System.out.println("Large number");
        }

    }
}
