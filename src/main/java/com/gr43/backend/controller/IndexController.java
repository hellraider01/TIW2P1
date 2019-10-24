/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.controller;

import com.gr43.backend.model.Categoria;
import com.gr43.backend.model.Producto;
import com.gr43.backend.model.Usuario;
import com.gr43.backend.service.CategoriaServicio;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gr43.backend.service.ProductoServicio;
import com.gr43.backend.service.UsuarioServicio;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author sergio
 */
@Controller
public class IndexController {
    
    @Autowired
    public ProductoServicio pService;
    
    @Autowired
    public CategoriaServicio cService;
    
    @Autowired
    public UsuarioServicio uService;

    public IndexController() {
    }
    
 
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
        List<Usuario> usuarios = this.uService.listarTodos();
        ModelAndView model = new ModelAndView("usuario/index");
        model.addObject("usuarios", usuarios);
        return model;
    }

    @RequestMapping("/categorias")
    public ModelAndView categorias() {
        List<Categoria> categorias = this.cService.listarTodos();
        ModelAndView model = new ModelAndView("categoria/index");
        model.addObject("categorias", categorias);
        return model;
    }

    @RequestMapping("/productos")
    public ModelAndView productos() {
        List<Producto> productos = pService.listarTodos();
        ModelAndView model = new ModelAndView("productos/index");
        if(productos!=null){
            model.addObject("productos", productos);
        }
        return model;
    }

    @RequestMapping("/mi_perfil")
    public ModelAndView perfil() {
        ModelAndView model = new ModelAndView("usuario/perfil");
        return model;
    }
    
    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView model = new ModelAndView("usuario/perfil");
        return model;
    }
    
    @RequestMapping("/logout")
    public ModelAndView logout() {
        ModelAndView model = new ModelAndView("usuario/perfil");
        return model;
    }

}
