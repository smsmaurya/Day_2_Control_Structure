package com.bridgeLabz.breakStatement;

public class BreakWithForLoop {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
    }
}
