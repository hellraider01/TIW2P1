/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.service;

import com.gr43.backend.dao.CategoriaDao;
import com.gr43.backend.dao.ProductoDao;
import com.gr43.backend.model.Categoria;
import com.gr43.backend.model.Producto;
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
public class CategoriaServiceimpl implements CategoriaServicio{
    
    @Autowired
    CategoriaDao cdao;

    public CategoriaServiceimpl() {
    }
    

    @Transactional
    @Override
    public void crear_categoria(Categoria u) {
        this.cdao.save(u);
    }

    @Override
    @Transactional
    public List<Categoria> listarTodos() {
        return cdao.findAll();
    }
    
    @PostConstruct
    public void init(){
        Categoria p = new Categoria();
        p.setNombre("Root");
        p.setPadre(0);
        this.cdao.save(p);
    }
    
    
}
