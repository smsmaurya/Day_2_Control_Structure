package com.bridgeLabz.day2practiceProblems;

import java.util.Scanner;

public class ForLoopPractice {
    public static void main(String[] args){
//       sumOfNaturalNumbers();
//       System.out.println("Reverse of the given number is :"+reverseNumber());
//       checkPalindrome();
    }

    public static void sumOfNaturalNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for sum of natural numbers :");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0;i<=num;i++){
            sum = sum+i;
        }System.out.println("Total sum of natural number is: "+sum);
    }

    public static int reverseNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for reversing the number :");
        int num = sc.nextInt();
        int revNum =0;
        for(;num!=0;num/=10){
           revNum = revNum*10+(num%10);
        }
        return revNum;
    }

    public static void checkPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for reversing the number :");
        int num = sc.nextInt();
        int cNum = num;
        int revNum =0;
        for(;cNum!=0;cNum/=10){
            revNum = revNum*10+(cNum%10);
        }
        if(revNum==num){
            System.out.println("Given number is palindrome number");
        }
        else{
            System.out.println("Given number is not palindrome number");
        }
    }
}
