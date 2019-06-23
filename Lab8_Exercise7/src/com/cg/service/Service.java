package com.cg.service;

/**
 *
 * @author tanmpath
 */
public class Service {
    public boolean validateUsername(String username){
        if(username.matches("\\w{8}(\\w)*_job"))return true;
        return false;
    }
}
