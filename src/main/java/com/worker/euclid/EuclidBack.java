package com.worker.euclid;

import java.util.*;
public class EuclidBack {
    public static void main(String[] args) {

    }
    public int calcEuclid(String help1, String help2){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(help1);
        int b = Integer.parseInt(help2);
        int c = 0;
        while(a%b !=0){
            c = a%b;
            a = b;
            b = c;
        }

        return b;
    }
}
