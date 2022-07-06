
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Skill;
import com.porfolioweb.api.service.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
    @PostMapping ("/new/skill")
    public void createPersona (@RequestBody Skill skill){
        skillServ.createSkill(skill);
    }
    
    @GetMapping ("/ver/skill")
    @ResponseBody
    public List<Skill> verSkill() {
        return skillServ.verSkill();
    }
    
   @GetMapping ("/ver/skill/{id}")
   @ResponseBody
   public Skill findSkill (@PathVariable Long id){
       return skillServ.findSkill(id);
    }
    
    @DeleteMapping ("/delete/skill/{id}")
    public void deleteSkill (@PathVariable Long id){
        skillServ.deleteSkill(id);
    }
    
    
    @PutMapping ("edit/skill")
    public void updateSkill (@RequestBody Skill skill){
        skillServ.updateSkill(skill);
    }
    
}
