/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Autores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Leonardo Lopez
 */
@Local
public interface AutoresFacadeLocal {

    void create(Autores autores);

    void edit(Autores autores);

    void remove(Autores autores);

    Autores find(Object id);

    List<Autores> findAll();

    List<Autores> findRange(int[] range);

    int count();
    
}
