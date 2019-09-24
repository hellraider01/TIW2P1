/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sergio
 */
@Controller
public class IndexController {
    
    @RequestMapping("/list")
    public ModelAndView listar() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
    
    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("dashboard");
        return model;
    }
    
    @RequestMapping("/usuarios")
    public ModelAndView usuarios() {
        ModelAndView model = new ModelAndView("usuario/index");
        return model;
    }
    
    @RequestMapping("/categorias")
    public ModelAndView categorias() {
        ModelAndView model = new ModelAndView("categoria/index");
        return model;
    }
    
    @RequestMapping("/productos")
    public ModelAndView productos() {
        ModelAndView model = new ModelAndView("productos/index");
        return model;
    }
    
    @RequestMapping("/mi_perfil")
    public ModelAndView perfil() {
        ModelAndView model = new ModelAndView("usuario/perfil");
        return model;
    }
    
}
