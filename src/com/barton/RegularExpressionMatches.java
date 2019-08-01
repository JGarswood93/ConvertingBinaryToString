package com.barton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatches {
    /**
     * This shows how to find a digit string from a given alphabetic value
     * @param args
     */
    public static void main(String[] args) {
        String line = "This order was placed for Customer 1, ok!";
        String pattern = "(.*)(\\d+)(.*)";
        System.out.println(line);
        Pattern r = Pattern.compile((pattern));

        Matcher m = r.matcher(line);

        if(m.find( )){
            System.out.println("Found value: " + m.group(0));
             System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        }
        else{
            System.out.println("NO MATCH");
        }
    }
}
