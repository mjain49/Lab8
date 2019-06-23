package com.cg.service;

import java.util.StringTokenizer;

/**
 *
 * @author tanmpath
 */
public class service {
    public void getStringSum(String input){
        int sum = 0;
        StringTokenizer token = new StringTokenizer(input," ");
        while(token.hasMoreTokens()){
            String element = token.nextToken();
            System.out.println(element);
            sum = sum + Integer.parseInt(element);
        }
        System.out.println("Sum is : "+sum);
    }
}
