package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.service.Service;
/**
 *
 * @author tanmpath
 */
public class UserInterface {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Service service = new Service();
        
        try{
            System.out.println("Enter username of jobseeker");
            String username = br.readLine();
            System.out.println(service.validateUsername(username)?"User name is valid":"Username is invalid");
        }catch(IOException e){
            System.out.println("Wrong input given");
        }
        
    }
}
