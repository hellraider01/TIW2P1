/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sergio
 */
@Controller
public class IndexControlller {
    
    @RequestMapping("index")
    public String page(Model model) {
        return "index";
    }
    
}
