
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Proyecto;
import com.porfolioweb.api.service.IProyectoService;
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
public class ProyectoController {
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping ("/new/proyecto")
    public void createProyecto (@RequestBody Proyecto proy){
        proyServ.createProyecto(proy);
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proyServ.verProyecto();
    }
    
   @GetMapping ("/ver/proyecto/{id}")
   @ResponseBody
   public Proyecto findProyecto (@PathVariable Long id){
       return proyServ.findProyecto(id);
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void deleteProyecto (@PathVariable Long id){
        proyServ.deleteProyecto(id);
    }
    
    
    @PutMapping ("edit/proyecto")
    public void updateProyecto (@RequestBody Proyecto proy){
        proyServ.updateProyecto(proy);
    }
    
}
