/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asm.repositories;

import asm.entities.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SeRGiO11
 */
@Repository
public interface ProductoRepositorioCRUD  extends CrudRepository<Producto, Long>{
    public Producto findByName(String name);
}
