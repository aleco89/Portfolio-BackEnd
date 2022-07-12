
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
public class Idioma {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String idioma;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Persona persona;
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="nivel_idioma_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private NivelIdioma nivelIdioma;
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="institucion_empresa_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private InstitucionEmpresa institucionEmpresa;
    
    public Idioma() {
    }

    public Idioma(Long id, String idioma, Persona persona, NivelIdioma nivelIdioma, InstitucionEmpresa institucionEmpresa) {
        this.id = id;
        this.idioma = idioma;
        this.persona = persona;
        this.nivelIdioma = nivelIdioma;
        this.institucionEmpresa = institucionEmpresa;
    }           
    
}
