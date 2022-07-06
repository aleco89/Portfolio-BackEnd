
package com.porfolioweb.api.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InstitucionEmpresa implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    @Column(name = "url_logo")
    private String urlLogo;

    public InstitucionEmpresa() {
    }

    public InstitucionEmpresa(Long id, String nombre, String urlLogo) {
        this.id = id;
        this.nombre = nombre;
        this.urlLogo = urlLogo;
    }
    
    
    
}