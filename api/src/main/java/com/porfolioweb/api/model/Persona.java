
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
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String sobreMi;
    private String lugarResidencia;
    private String urlFoto;
    private String email;
    private String username;
    private String password;
    
    /*
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")    
    private List<Educacion> educacion;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")    
    private List<Experiencia> experiencia;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")    
    private List<Idioma> idioma;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")    
    private List<Skill> skill;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")    
    private List<Proyecto> proyecto;
    */

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String sobreMi, String lugarResidencia, String urlFoto, String email, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobreMi = sobreMi;
        this.lugarResidencia = lugarResidencia;
        this.urlFoto = urlFoto;
        this.email = email;
        this.username = username;
        this.password = password;
        
    }

    
   
}
