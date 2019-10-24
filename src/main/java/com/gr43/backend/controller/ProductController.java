package com.gr43.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gr43.backend.model.Producto;
import com.gr43.backend.model.Categoria;
import com.gr43.backend.service.CategoriaServicio;
import com.gr43.backend.service.ProductoServicio;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private CategoriaServicio cservicio;
    
    @Autowired
    private ProductoServicio pservicio;

    @RequestMapping("/list")
    public String listar() {
        return "model";
    }

    @RequestMapping("/ver_crear")
    public ModelAndView ver_crear() {
        ModelAndView model = new ModelAndView("productos/crear");
        List<Categoria> categorias = cservicio.listarTodos();
        if(categorias!=null){
            model.addObject("categorias", categorias);
        }
        return model;
    }

    @RequestMapping(value="/crear", method= RequestMethod.POST)
    public ModelAndView crear(@RequestParam String nombre, @RequestParam String descripcion, @RequestParam String resumen, @RequestParam MultipartFile file, @RequestParam String unidades, @RequestParam String categoria) throws IOException {
        Base64.Encoder encoder = Base64.getEncoder();
	String base64 = encoder.encodeToString(file.getBytes());
        Producto pro = new Producto();
        pro.setNombre(nombre);
        pro.setResumen(resumen);
        pro.setDescripcion(descripcion);
        pro.setCantidad(Integer.parseInt(unidades));
        pro.setActivo(true);
        pro.setImagen(base64);
        System.out.println(base64);
        this.pservicio.crear_producto(pro);
        // vuelvo a la vista
        ModelAndView vista = new ModelAndView("productos/index");
        List<Producto> productos = pservicio.listarTodos();
        vista.addObject("productos", productos);
        return vista;
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
