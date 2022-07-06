
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Experiencia;
import com.porfolioweb.api.service.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new/experiencia")
    public void createExperiencia (@RequestBody Experiencia exp){
        expServ.createExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expServ.verExperiencia();
    }
    
   @GetMapping ("/ver/experiencia/{id}")
   @ResponseBody
   public Experiencia findExperiencia (@PathVariable Long id){
       return expServ.findExperiencia(id);
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void deleteExperiencia (@PathVariable Long id){
        expServ.deleteExperiencia(id);
    }
    
    
    @PutMapping ("edit/experiencia")
    public void updateExperiencia (@RequestBody Experiencia exp){
        expServ.updateExperiencia(exp);
    }
    
}
