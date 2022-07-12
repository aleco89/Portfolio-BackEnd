
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
public class NivelIdioma {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nivel;     
    

    public NivelIdioma() {
    }

    public NivelIdioma(Long id, String nivel) {
        this.id = id;
        this.nivel = nivel;    
    }
       
}
