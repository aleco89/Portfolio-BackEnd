
package com.porfolioweb.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PorcentajeSkill {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long porcentaje; 
    

    public PorcentajeSkill() {
    }     

    public PorcentajeSkill(Long id, Long porcentaje) {
        this.id = id;
        this.porcentaje = porcentaje;
    }
        
}
