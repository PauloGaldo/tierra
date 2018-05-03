/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.galdo.tierra.controller;

import ar.com.galdo.tierra.dao.EspecialidadDao;
import ar.com.galdo.tierra.users.model.Especialidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Softlogia PC
 */
@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
    
    private final EspecialidadDao especialidadDao;

    @Autowired
    public EspecialidadController(EspecialidadDao especialidadDao) {
        this.especialidadDao = especialidadDao;
    }  

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        List<Especialidad> list = especialidadDao.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
