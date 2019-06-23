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
    public String getFileMetadata(String filepath){
        try{
            File file = new File(filepath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            if(file.exists()){
                String line = null;
                int character_count = 0;
                int line_count = 0;
                int word_count = 0;
                while((line = br.readLine())!=null){
                    line = line.replaceAll(" +"," ").trim();
                    StringTokenizer token = new StringTokenizer(line," ");
                    while(token.hasMoreTokens()){
                        word_count++;
                        token.nextToken();
                    }
                    line = line.replaceAll(" +","");
                    character_count += line.length();
                    line_count++;
                }
                return "Character count : "+character_count+
                        "\nLine count : "+line_count+
                        "\nWord count : "+word_count;
            }else{
                System.out.println("File does not exist");
            }
            
        }catch(IOException e){
            System.out.println("Error in reading file");
        }
        return null;
    }
}
