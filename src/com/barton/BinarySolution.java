package com.barton;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[] groupings = Integer.toBinaryString(n).split("0");

        Arrays.sort(groupings);

        System.out.println(groupings[groupings.length - 1].length());
    }
}
