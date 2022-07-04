
package com.porfolioweb.api.repository;

import com.porfolioweb.api.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository <Proyecto, Long> {
    
}
