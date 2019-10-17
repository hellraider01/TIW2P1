package com.gr43.backend.dao;

import com.gr43.backend.model.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaoImpl extends GenericDaoImpl<Usuario> implements UsuarioDao {

    public UsuarioDaoImpl() {
    }
    
    

    /*@PostConstruct
    private void init() {
        Usuario admin = new Usuario("admin", "admin","admin", "admin",true,"alguna");
        this.save(admin);
        Usuario seler = new Usuario("seler", "seler","admin", "admin",true,"alguna");
        this.save(seler);
        Usuario  buyer = new Usuario("buyer", "buyer","admin", "admin",true,"alguna");
        this.save(buyer);
        
    }*/
}
