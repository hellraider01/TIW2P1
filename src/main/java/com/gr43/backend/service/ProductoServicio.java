/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gr43.backend.service;

import com.gr43.backend.model.Producto;
import java.util.List;

/**
 *
 * @author sergio
 */
public interface ProductoServicio {

    public List<Producto> listarTodos();
    
    public void crear_producto(Producto u);
    
}
