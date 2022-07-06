
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Skill;
import com.porfolioweb.api.repository.SkillRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkillService{
     
    @Autowired
    public SkillRepo skillRepo;   

    @Override
    public List<Skill> verSkill() {
        return skillRepo.findAll();
    }

    @Override
    public void createSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public Skill findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }

    @Override
    public void updateSkill(Skill skill) {
        skillRepo.save(skill);
    }    
    
    @Override
    public void deleteSkill(Long id) {
        skillRepo.deleteById(id);
    }
}
