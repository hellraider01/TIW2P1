/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
@RequestMapping("icontroller")
public class IndexControlller {
    
    @RequestMapping("index")
    public ModelAndView page() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
    
}
