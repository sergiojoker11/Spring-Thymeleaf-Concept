/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sj11.asm.repositories;

import sj11.asm.entities.Formato;
import sj11.asm.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SeRGiO11
 */
@Repository
public class ProductoRepositorio {
    
    public List<Producto> dameProductos(){
        Formato y1 = new Formato("1KG");
        Formato y2 = new Formato("2KG");
        Formato y3 = new Formato("3KG");
        Formato y4 = new Formato("4KG");
        Formato y5 = new Formato("5KG");
        Formato y6 = new Formato("6KG");
        Formato y7 = new Formato("7KG");
        Formato y8 = new Formato("8KG");
        List<Formato> listaFormatos1 = new ArrayList<>();
        List<Formato> listaFormatos2 = new ArrayList<>();
        listaFormatos1.add(y1);
        listaFormatos1.add(y2);
        listaFormatos1.add(y3);
        listaFormatos1.add(y4);
        listaFormatos1.add(y5);
        listaFormatos2.add(y6);
        listaFormatos2.add(y7);
        listaFormatos2.add(y8);
        Producto x1 = new Producto("Mierda", listaFormatos1);
        Producto x2 = new Producto("Polla", listaFormatos2);
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(x1);
        listaProductos.add(x2);
        return listaProductos;
    }
}
