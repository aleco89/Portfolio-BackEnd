
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
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEducacion;
    private String periodo;

    public Educacion() {
    }

    public Educacion(Long id, String nombreEducacion, String periodo) {
        this.id = id;
        this.nombreEducacion = nombreEducacion;
        this.periodo = periodo;
    }  
    
        
}
