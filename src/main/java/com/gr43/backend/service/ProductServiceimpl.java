/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.service;

import com.gr43.backend.dao.ProductoDao;
import com.gr43.backend.model.Producto;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sergio
 */
@Service
public class ProductServiceimpl implements ProductoServicio{
    
    @Autowired
    ProductoDao pdao;

    public ProductServiceimpl() {
    }
    
    @Override
    public void crear_producto(Producto u) {
        this.pdao.save(u);
        System.out.println("Producto Guardado");
    }

    @Override
    public List<Producto> listarTodos() {
        return pdao.findAll(Producto.class);
    }
    
    @PostConstruct
    public void init(){
        Producto p = new Producto();
        p.setActivo(true);
        p.setNombre("Test");
        p.setResumen("resumen");
        p.setDescripcion("descripcion");
        p.setCantidad(25);
        p.setPrecio(new BigDecimal("25.3"));
        this.pdao.save(p);
    }
    
    
}
