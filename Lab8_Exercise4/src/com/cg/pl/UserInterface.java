package com.cg.pl;

import com.cg.service.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author tanmpath
 */
public class UserInterface {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Enter file path");
            String filepath = br.readLine();
            
            Service service = new Service();
            
            service.getFileMetadata(filepath);
        }catch(IOException e){
            System.out.println("Wrong input is given");
        }
    }
}
