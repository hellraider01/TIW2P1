/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.service;

import com.gr43.backend.dao.UsuarioDao;
import com.gr43.backend.model.Usuario;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sergio
 */
@Service
public class UsuarioServiceimpl implements UsuarioServicio{
    
    @Autowired
    UsuarioDao udao;

    public UsuarioServiceimpl() {
    }
    
   
    @Override
    public void crear_usuario(Usuario u) {
        this.udao.save(u);
    }

    @Override
    public List<Usuario> listarTodos() {
        return udao.findAll(Usuario.class);
    }
    
    @PostConstruct
    public void init(){
        Usuario p = new Usuario();
        p.setActivo(true);
        p.setNombre("admin");
        p.setEmail("admin@admin.org");
        p.setPassword("admin");
        p.setRol(0);
        this.udao.save(p);
        Usuario p1 = new Usuario();
        p1.setActivo(true);
        p1.setNombre("buyer");
        p1.setEmail("buyer@buyer.org");
        p1.setPassword("buyer");
        p1.setRol(1);
        this.udao.save(p1);
        Usuario p2 = new Usuario();
        p2.setActivo(true);
        p2.setNombre("seller");
        p2.setEmail("seller@seller.org");
        p2.setPassword("seller");
        p2.setRol(2);
        this.udao.save(p2);
    }
    
    
}
