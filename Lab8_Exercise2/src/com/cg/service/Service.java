package com.cg.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author tanmpath
 */
public class Service {
    public void displayFileData(String filepath){
        try{
            File file = new File(filepath);
            if(file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                int i = 1;
                while((line = br.readLine())!=null){
                    System.out.println((i++)+". "+line);
                }
            }else{
                System.out.println("The specified file does not exist at : "+filepath);
            }
        }catch(IOException e){
            System.out.println("Error in reading file");
        }
    }
}
