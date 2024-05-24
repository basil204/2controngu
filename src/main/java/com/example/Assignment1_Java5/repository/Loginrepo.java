/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Assignment1_Java5.repository;

import com.example.Assignment1_Java5.model.login;

/**
 *
 * @author Lmanh
 */
public class Loginrepo {
    public boolean login(login lg){
        if(lg.getUsername().equals("admin")&&lg.getPassword().equals("admin")){
            return true;
        }
        return false;     
    }
}
