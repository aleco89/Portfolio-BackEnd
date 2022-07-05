/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Persona;
import com.porfolioweb.api.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/new/persona")
    public void createPersona (@RequestBody Persona per){
        persoServ.createPersona(per);
    }
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
   @GetMapping ("/ver/persona/{id}")
   @ResponseBody
   public Persona findPersona (@PathVariable Long id){
       return persoServ.findPersona(id);
    }
    
    @DeleteMapping ("/delete/persona/{id}")
    public void deletePersona (@PathVariable Long id){
        persoServ.deletePersona(id);
    }
    
    
    @PutMapping ("edit/persona")
    public void updatePersona (@RequestBody Persona per){
        persoServ.updatePersona(per);
    }
    
}
