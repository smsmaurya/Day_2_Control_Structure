package com.bridgeLabz.day2practiceProblems.operatorPrograms;

import java.util.Scanner;

public class FindMaxAndMinNumber {
    public static void main(String[] args){
        System.out.println("Enter the three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int op1,op2,op3,op4,min,max;
        op1 = a+b*c;
        op2 = c+a/b;
        op3 = a%b+c;
        op4 = a*b+c;
        if((op1>op2) && (op1>op3) && (op1>op4)){
            max = op1;
        } else if ((op2>op3) && (op2>op4)) {
            max = op2;
        } else if (op3>op4) {
            max = op3;
        }else{
            max = op4;
        }

        if((op1<op2) && (op1<op3) && (op1<op4)){
            min = op1;
        } else if ((op2<op3) && (op2<op4)) {
            min = op2;
        } else if (op3<op4) {
            min = op3;
        }else{
            min = op4;
        }
        System.out.println("a+b*c :"+op1);
        System.out.println("c+a/b :"+op2);
        System.out.println("a%b+c :"+op3);
        System.out.println("a*b+c :"+op4);
        System.out.println("the max number is : "+max);
        System.out.println(("the min number is : "+min));

    }
}
