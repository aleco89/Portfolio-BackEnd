
package com.porfolioweb.api.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String trabajo;
    private String periodo;
    private String descripcionTrabajo;
    public Experiencia() {
    }

    public Experiencia(Long id, String trabajo, String periodo, String descripcionTrabajo) {
        this.id = id;
        this.trabajo = trabajo;
        this.periodo = periodo;
        this.descripcionTrabajo = descripcionTrabajo;
    }

  
    
    
}
