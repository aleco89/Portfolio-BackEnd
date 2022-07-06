
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Educacion;
import com.porfolioweb.api.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepo eduRepo;

        
    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void updateEducacion(Educacion edu) {      
        eduRepo.save(edu);
    }    
    
    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
