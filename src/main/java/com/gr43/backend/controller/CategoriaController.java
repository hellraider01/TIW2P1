package com.gr43.backend.controller;

import com.gr43.backend.dao.CategoriaDao;
import com.gr43.backend.model.Categoria;
import com.gr43.backend.service.CategoriaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    public CategoriaServicio cServicio;
    
    @Autowired
    public CategoriaDao cDao;
    
    @RequestMapping(value = "/ver_crear", method = RequestMethod.GET)
    public ModelAndView crear() {
        List<Categoria> cats = this.cServicio.listarTodos();
        ModelAndView model = new ModelAndView("categoria/crear");
        model.addObject("categorias", cats);
        return model;
    }

    @RequestMapping(value = "/crear", method = RequestMethod.POST)
    public ModelAndView crear(@RequestParam String nombre, @RequestParam String idCat) {
        Categoria cat = this.cServicio.get_categoria(Integer.parseInt(idCat));
        Categoria c = new Categoria();
        c.setNombre(nombre);
        if(cat!=null){
            c.getHijas().add(cat);
        }
        this.cDao.save(c);
        //this.cServicio.crear_categoria(c);
        ModelAndView model = new ModelAndView("usuario/index");
        
        return model;
    }

}
