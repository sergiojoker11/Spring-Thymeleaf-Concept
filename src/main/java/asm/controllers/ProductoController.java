/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.controllers;

import asm.entities.Producto;
import java.util.Calendar;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import asm.repositories.ProductoRepositorio;

/**
 *
 * @author SeRGiO11
 */
@Controller
public class ProductoController {
    @Autowired
    ProductoRepositorio productoRepositorio;
    
    @ModelAttribute("allProductos")
    public List<Producto> getProductos(){
        return productoRepositorio.dameProductos();
    }
    
    @RequestMapping({"/","/index"})
    public String showSeedstarters() {
        return "index";
    }
}
