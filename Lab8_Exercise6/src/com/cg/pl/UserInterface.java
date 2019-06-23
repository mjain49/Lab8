package com.cg.pl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.service.Service;
import java.util.Date;
/**
 *
 * @author tanmpath
 */
public class UserInterface {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Service service = new Service();
        
        try{
            System.out.println("Enter day");
            int day = Integer.parseInt(br.readLine());
            
            System.out.println("Enter month");
            int month = Integer.parseInt(br.readLine());
            
            System.out.println("Enter year");
            int year = Integer.parseInt(br.readLine());
            
            Date date = new Date(year-1900, month, day);
            
            System.out.println(date);
            
            service.getDuration(date);
            
        }catch(IOException e){
            System.out.println("Wrong input given");
        }
    }
}
