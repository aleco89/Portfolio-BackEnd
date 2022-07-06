
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.NivelIdioma;
import com.porfolioweb.api.service.INivelIdiomaService;
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
public class NivelIdiomaController {
    @Autowired
    private INivelIdiomaService niServ;
    
    @PostMapping ("/new/nivelidioma")
    public void createNivelIdioma (@RequestBody NivelIdioma ni){
        niServ.createNivelIdioma(ni);
    }
    
    @GetMapping ("/ver/nivelidioma")
    @ResponseBody
    public List<NivelIdioma> verNivelIdioma() {
        return niServ.verNivelIdioma();
    }
    
   @GetMapping ("/ver/nivelidioma/{id}")
   @ResponseBody
   public NivelIdioma findNivelIdioma (@PathVariable Long id){
       return niServ.findNivelIdioma(id);
    }
    
    @DeleteMapping ("/delete/nivelidioma/{id}")
    public void deleteNivelIdioma (@PathVariable Long id){
        niServ.deleteNivelIdioma(id);
    }
    
    
    @PutMapping ("edit/nivelidioma")
    public void updateNivelIdioma (@RequestBody NivelIdioma ni){
        niServ.updateNivelIdioma(ni);
    }
    
}
