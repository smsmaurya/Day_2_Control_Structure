package com.bridgeLabz.day2practiceProblems.operatorPrograms;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'a' :");
        double a = sc.nextInt();
        System.out.println("Enter the value of 'b' :");
        double b = sc.nextInt();
        System.out.println("Enter the value of 'c' :");
        double c = sc.nextInt();

        double delta = delta(a,b,c);
        double root1 = root1(a,b,delta);
        double root2 = root2(a,b,delta);

        System.out.println(" the roots of the equation (a*x*x + b*x + c) are :"+root1+" and "+root2);

    }

    public static double delta(double a, double b, double c){
        return b*b-(4*a*c);
    }

    public static double root1(double a, double b, double delta){
        return  (-b + Math.sqrt(delta))/(2*a);
    }

    public static double root2(double a, double b, double delta){
        return  (-b - Math.sqrt(delta))/(2*a);
    }
}
