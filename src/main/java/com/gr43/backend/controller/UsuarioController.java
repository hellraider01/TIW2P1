package com.gr43.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gr43.backend.dao.UsuarioDao;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioDao usuarioDao;

    @RequestMapping(value = "/listado", method = RequestMethod.GET)
    public ModelAndView usuarios() {
        return new ModelAndView("usuario/index");
    }

    @RequestMapping(value = "/crear", method = RequestMethod.GET)
    public ModelAndView crear() {
        return new ModelAndView("usuario/index");
    }

    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public ModelAndView registro() {
        return new ModelAndView("usuario/index");
    }

}
