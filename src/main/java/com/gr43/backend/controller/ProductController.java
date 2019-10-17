package com.gr43.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gr43.backend.model.Producto;
import com.gr43.backend.dao.ProductoDao;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductoDao pservicio;

    @RequestMapping("/list")
    public String listar() {
        return "model";
    }

    @RequestMapping("/ver_crear")
    public ModelAndView ver_crear() {
        return new ModelAndView("productos/crear");
    }

    @RequestMapping("/crear")
    public ModelAndView crear(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam String resumen, @RequestParam String url, @RequestParam String unidades, @RequestParam String categoria) {
        Producto pro = new Producto();
        pro.setNombre(nombre);
        pro.setResumen(resumen);
        pro.setDescripcion(descripcion);
        pro.setCantidad(Integer.parseInt(unidades));
        pro.setActivo(true);
        this.pservicio.save(pro);
        return new ModelAndView("productos/index");
    }

    @RequestMapping("/ver_actualizar")
    public ModelAndView ver_actualizar() {
        return new ModelAndView("productos/crear");
    }

    @RequestMapping("/actualizar")
    public ModelAndView actualizar() {
        return new ModelAndView("productos/crear");
    }

    @RequestMapping("/eliminar")
    public ModelAndView actualizar(@RequestParam int id) {
        return new ModelAndView("productos/crear");
    }

}
