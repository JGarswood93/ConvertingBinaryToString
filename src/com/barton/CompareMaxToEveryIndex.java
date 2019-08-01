package com.barton;

import java.util.Scanner;

public class CompareMaxToEveryIndex {
    /**
     * Compare max to every index in array
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
