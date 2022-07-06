
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Proyecto;
import com.porfolioweb.api.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepo proyRepo;

        
    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void createProyecto (Proyecto proy) {
        proyRepo.save(proy);
    }

    @Override
    public void updateProyecto (Proyecto proy) {      
        proyRepo.save(proy);
    }
       
    @Override
    public void deleteProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto findProyecto (Long id) {
        return proyRepo.findById(id).orElse(null);
    }
    
}
