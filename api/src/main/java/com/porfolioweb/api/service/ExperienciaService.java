
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Experiencia;
import com.porfolioweb.api.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    public ExperienciaRepo expRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void createExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void updateExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
       return expRepo.findById(id).orElse(null);
    }
  
}
