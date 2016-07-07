/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.entities;

import java.util.List;

/**
 *
 * @author SeRGiO11
 */
public class Producto {
    private String nombre;
    private List<Formato> listaFormatos;

    public Producto(String nombre, List<Formato> listaFormatos) {
        this.nombre = nombre;
        this.listaFormatos = listaFormatos;
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
