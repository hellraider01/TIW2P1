/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.service;

import com.gr43.backend.model.Categoria;
import java.util.List;

/**
 *
 * @author sergio
 */
public interface CategoriaServicio {

    public List<Categoria> listarTodos();
    
    public void crear_categoria(Categoria u);
    
}
