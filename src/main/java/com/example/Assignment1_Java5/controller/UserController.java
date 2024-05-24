/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Assignment1_Java5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lmanh
 */
@Controller
@RequestMapping(value = {"/views"})
public class UserController {
    private final LoginController loginController;

    @Autowired
    public UserController(LoginController loginController) {
        this.loginController = loginController;
    }

    @GetMapping("/list")
    public String list() {
        if (loginController.isLogin==false) {
            return "redirect:/view/login";
        }
            return "user/list";
        
    }
    @GetMapping("/add")
    public String add(){
        if (loginController.isLogin==false) {
            return "redirect:/view/login";
        }
            return "user/list";
        
    }
}
