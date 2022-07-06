
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> verSkill();
    public void createSkill (Skill sk);
    public void updateSkill (Skill sk);
    public void deleteSkill (Long id);
    public Skill findSkill(Long id);
}
