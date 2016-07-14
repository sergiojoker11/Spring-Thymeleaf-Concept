/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sj11.asm.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author SeRGiO11
 */

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotNull
    private String nombre;
    private List<Formato> listaFormatos;

    public Producto(String nombre, List<Formato> listaFormatos) {
        this.nombre = nombre;
        this.listaFormatos = listaFormatos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Formato> getListaFormatos() {
        return listaFormatos;
    }

    public void setListaFormatos(List<Formato> listaFormatos) {
        this.listaFormatos = listaFormatos;
    }
}
