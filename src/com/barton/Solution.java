package com.barton;

import java.util.Scanner;

public class Solution {

    public static  int mostFrequentOnes(int n) {
        /**
         * converts number to a binary string then to a char array
         */
        char[] binary = Integer.toBinaryString(n).toCharArray();
        /**
         * count of current sequence of consecutive ones
         */
        int ihmCount = 0;
        int maxCount = 0;
        for(int i = 0; i < binary.length; i ++){

            if(binary[i] == '0') {

                if(ihmCount > maxCount){
                    maxCount = ihmCount;
                }
                ihmCount = 0;
            }
            else {
                ihmCount = ihmCount + 1;
            }
        }
        return (ihmCount > maxCount) ? ihmCount : maxCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        System.out.println(mostFrequentOnes(n));
    }
}

