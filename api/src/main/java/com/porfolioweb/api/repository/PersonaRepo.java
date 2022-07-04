
package com.porfolioweb.api.repository;

import com.porfolioweb.api.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepo extends JpaRepository <Persona, Long> {
    
}
