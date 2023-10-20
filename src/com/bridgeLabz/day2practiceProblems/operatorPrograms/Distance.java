package com.bridgeLabz.day2practiceProblems.operatorPrograms;

//import java.util.Scanner;

public class Distance {
    public static void main(String[] args){
        int x=0, y=0;
        for(String str: args) {
            // convert into integer type
            x = Integer.parseInt(str);
            y = Integer.parseInt(str);

        }
        /*Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();*/

        double calcDistance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println(" The the Euclidean distance from the point (x, y) to the origin (0, 0) is :"+calcDistance);
    }
}
