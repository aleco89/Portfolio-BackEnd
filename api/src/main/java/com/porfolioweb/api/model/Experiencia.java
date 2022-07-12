
package com.porfolioweb.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Experiencia {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String trabajo;
    private String periodo;
    private String descripcionTrabajo;
    
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Persona persona;
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="institucion_empresa_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private InstitucionEmpresa institucionEmpresa;
    
    public Experiencia() {
    }

    public Experiencia(Long id, String trabajo, String periodo, String descripcionTrabajo, Persona persona, InstitucionEmpresa institucionEmpresa) {
        this.id = id;
        this.trabajo = trabajo;
        this.periodo = periodo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.persona = persona;
        this.institucionEmpresa = institucionEmpresa;
    }  
    
    
}
