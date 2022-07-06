
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.InstitucionEmpresa;
import com.porfolioweb.api.service.IInstitucionEmpresaService;
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
public class InstitucionEmpresaController {
    
    @Autowired
    private IInstitucionEmpresaService ieServ;
    
    @PostMapping ("/new/institucionempresa")
    public void createPersona (@RequestBody InstitucionEmpresa ie){
        ieServ.createInstitucionEmpresa(ie);
    }
    
    @GetMapping ("/ver/institucionempresa")
    @ResponseBody
    public List<InstitucionEmpresa> verInstitucionEmpresa() {
        return ieServ.verInstitucionEmpresa();
    }
    
   @GetMapping ("/ver/institucionempresa/{id}")
   @ResponseBody
   public InstitucionEmpresa findInstitucionEmpresa (@PathVariable Long id){
       return ieServ.findInstitucionEmpresa(id);
    }
    
    @DeleteMapping ("/delete/institucionempresa/{id}")
    public void deletePersona (@PathVariable Long id){
        ieServ.deleteInstitucionEmpresa(id);
    }
    
    
    @PutMapping ("edit/institucionempresa")
    public void updateInstitucionEmpresa (@RequestBody InstitucionEmpresa ie){
        ieServ.updateInstitucionEmpresa(ie);
    }
    
}
