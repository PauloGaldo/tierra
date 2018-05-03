/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.galdo.tierra.dao;

import ar.com.galdo.tierra.users.model.Especialidad;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Softlogia PC
 */
@Component
@Repository
public interface EspecialidadDao {

    List<Especialidad> findAll();
    
}
