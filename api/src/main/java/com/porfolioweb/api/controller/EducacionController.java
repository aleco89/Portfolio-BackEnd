
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Educacion;
import com.porfolioweb.api.service.IEducacionService;
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
public class EducacionController {
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/educacion")
    public void createEducacion (@RequestBody Educacion edu){
        eduServ.createEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
   @GetMapping ("/ver/educacion/{id}")
   @ResponseBody
   public Educacion findEducacion (@PathVariable Long id){
       return eduServ.findEducacion(id);
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void deleteEducacion (@PathVariable Long id){
        eduServ.deleteEducacion(id);
    }
    
    
    @PutMapping ("edit/educacion")
    public void updateEducacion (@RequestBody Educacion edu){
        eduServ.updateEducacion(edu);
    }
}
