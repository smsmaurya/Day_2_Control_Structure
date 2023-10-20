package com.bridgeLabz.day2practiceProblems;

import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args){
        checkVowelOrConsonant();
        System.out.println("The month name is: "+printMonthName());
    }

    public static void checkVowelOrConsonant(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("The given character is vowel");
                break;
            default:{
                System.out.println("the given character is consonant");
            }
        }
    }

    public static String printMonthName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int monthNumber = sc.nextInt();
        String monthName="";
        switch (monthNumber){
            case 1:
                monthName="January";
                break;
            case 2:
                monthName="February";
                break;
            case 3:
                monthName="March";
                break;
            case 4:
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
                break;
            case 7:
                monthName="July";
                break;
            case 8:
                monthName="August";
                break;
            case 9:
                monthName="September";
                break;
            case 10:
                monthName="October";
                break;
            case 11:
                monthName="November";
                break;
            case 12:
                monthName="December";
                break;
            default:System.out.println("Invalid month number");
        }

        return monthName;
    }
}
