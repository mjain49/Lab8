package com.cg.service;

/**
 *
 * @author tanmpath
 */
public class Service {
    public boolean isPositiveString(String input){
        input = input.toLowerCase();
        char prev_char = input.charAt(0);
        for(int i=1;i<input.length();i++){
            char next_char = input.charAt(i);
            if((int)prev_char > (int)next_char) return false;
        }
        return true;
    }
}
