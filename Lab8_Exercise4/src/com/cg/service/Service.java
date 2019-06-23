package com.cg.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author tanmpath
 */
public class Service {
    public void getFileMetadata(String filepath){
        try{
            File file = new File(filepath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            if(file.exists()){
                System.out.println("File "+file.getName()+" exist.");
                if(file.canRead()){
                    System.out.println("File "+file.getName()+" is readable.");
                }else{
                    System.out.println("File "+file.getName()+" can't be read.");
                }
                if(file.canWrite()){
                    System.out.println("File "+file.getName()+" is writeable");
                }else{
                    System.out.println("File "+file.getName()+" is not writeable");
                }
                System.out.println("Size of file "+file.getName()+" is : "+file.length()+" Bytes");
            }else{
                System.out.println("File does not exist.");
            }
            
        }catch(IOException e){
            System.out.println("Error in reading file.");
        }
    }
}
