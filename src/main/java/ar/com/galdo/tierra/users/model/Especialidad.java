/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.galdo.tierra.users.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Softlogia PC
 */
@Entity
@Table(name = "especialidades")
@Getter
@Setter
public class Especialidad implements Serializable {

    @Id
    @Column(name = "especialidad_id")
    private Integer id;

    private String descripcion;

    public Especialidad() {
    }

}
