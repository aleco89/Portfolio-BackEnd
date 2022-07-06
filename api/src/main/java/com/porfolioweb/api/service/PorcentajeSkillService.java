
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.PorcentajeSkill;
import com.porfolioweb.api.repository.PorcentajeSkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PorcentajeSkillService implements IPorcentajeSkillService{
    
    @Autowired
    public PorcentajeSkillRepo psRepo;   

    @Override
    public List<PorcentajeSkill> verPorcentajeSkill() {
        return psRepo.findAll();
    }

    @Override
    public void createPorcentajeSkill(PorcentajeSkill pskill) {
        psRepo.save(pskill);
    }

    @Override
    public PorcentajeSkill findPorcentajeSkill(Long id) {
        return psRepo.findById(id).orElse(null);
    }

    @Override
    public void updatePorcentajeSkill(PorcentajeSkill pskill) {
        psRepo.save(pskill);
    }

    
    @Override
    public void deletePorcentajeSkill(Long id) {
        psRepo.deleteById(id);
    }
    
}
