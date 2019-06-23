package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.service.service;
import java.util.StringTokenizer;

/**
 *
 * @author tanmpath
 */
public class UserInterface {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        service service = new service();
        try{
            System.out.println("Enter the numeric string");
            String input = br.readLine().replaceAll("", " ").trim();
            service.getStringSum(input);    
        }catch(IOException e){
            System.out.println("Invalid input given");
        }
    }
}
