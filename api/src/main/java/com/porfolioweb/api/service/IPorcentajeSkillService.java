
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.PorcentajeSkill;
import java.util.List;


public interface IPorcentajeSkillService {
    public List<PorcentajeSkill> verPorcentajeSkill();
    public void createPorcentajeSkill (PorcentajeSkill pskill);
    public void updatePorcentajeSkill (PorcentajeSkill pskill);
    public void deletePorcentajeSkill (Long id);
    public PorcentajeSkill findPorcentajeSkill(Long id);
}
