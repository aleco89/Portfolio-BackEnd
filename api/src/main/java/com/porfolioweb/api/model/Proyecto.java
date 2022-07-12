
package com.porfolioweb.api.model;

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
public class Proyecto implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String comitente;
    private String descripcion;
    private String urlFoto;
    
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String comitente, String descripcion, String urlFoto, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.comitente = comitente;
        this.descripcion = descripcion;
        this.urlFoto = urlFoto;
        this.persona = persona;
    }   
    
    
}
