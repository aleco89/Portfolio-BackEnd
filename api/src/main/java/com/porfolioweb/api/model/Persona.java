
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
public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String lugarResidencia;
    private String urlFoto;
    private String email;
    private String username;
    private String password;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String sobre_mi, String lugarResidencia, String urlFoto, String email, String username, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.lugarResidencia = lugarResidencia;
        this.urlFoto = urlFoto;
        this.email = email;
        this.username = username;
        this.password = password;
    }

   
}
