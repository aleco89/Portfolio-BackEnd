
package com.porfolioweb.api.controller;


import com.porfolioweb.api.model.PorcentajeSkill;
import com.porfolioweb.api.service.IPorcentajeSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PorcentajeSkillController {
    @Autowired
    private IPorcentajeSkillService psServ;
    
    @PostMapping ("/new/porcentajeskill")
    public void createPorcentajeSkill (@RequestBody PorcentajeSkill pskill){
        psServ.createPorcentajeSkill(pskill);
    }
    
    @GetMapping ("/ver/porcentajeskill")
    @ResponseBody
    public List<PorcentajeSkill> verPorcentajeSkill() {
        return psServ.verPorcentajeSkill();
    }
    
   @GetMapping ("/ver/porcentajeskill/{id}")
   @ResponseBody
   public PorcentajeSkill findPorcentajeSkill (@PathVariable Long id){
       return psServ.findPorcentajeSkill(id);
    }
    
    @DeleteMapping ("/delete/porcentajeskill/{id}")
    public void deletePorcentajeSkill (@PathVariable Long id){
        psServ.deletePorcentajeSkill(id);
    }
    
    
    @PutMapping ("edit/porcentajeskill")
    public void updatePorcentajeSkill (@RequestBody PorcentajeSkill pskill){
        psServ.updatePorcentajeSkill(pskill);
    }
    
}
