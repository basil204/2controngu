/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Assignment1_Java5.controller;

import com.example.Assignment1_Java5.model.login;
import com.example.Assignment1_Java5.repository.Loginrepo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Lmanh
 */
@Controller
@RequestMapping(value = {"/view"})
public class LoginController {

    Loginrepo lgrepo;
    @Autowired
    private RestTemplate restTemplate;
    Boolean isLogin = false;

    public LoginController() {
        lgrepo = new Loginrepo();

    }

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @PostMapping("/logins")
    public String logins(Model model, login lg) {
        isLogin = lgrepo.login(lg);
        if (isLogin == false) {
            return "user/login";

        }
        return "redirect:/views/list";
    }
}
