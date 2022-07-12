
package com.porfolioweb.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEducacion;
    private String periodo;
    
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Persona persona;
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="institucion_empresa_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private InstitucionEmpresa institucionEmpresa;

    public Educacion() {
    }

    public Educacion(Long id, String nombreEducacion, String periodo, Persona persona, InstitucionEmpresa institucionEmpresa) {
        this.id = id;
        this.nombreEducacion = nombreEducacion;
        this.periodo = periodo;
        this.persona = persona;
        this.institucionEmpresa = institucionEmpresa;
    }    
            
}
