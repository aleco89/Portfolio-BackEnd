
package com.porfolioweb.api.controller;

import com.porfolioweb.api.model.Idioma;
import com.porfolioweb.api.service.IIdiomaService;
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
public class IdiomaController {
    
    @Autowired
    private IIdiomaService idiServ;
    
    @PostMapping ("/new/idioma")
    public void createIdioma (@RequestBody Idioma idi){
        idiServ.createIdioma(idi);
    }
    
    @GetMapping ("/ver/idioma")
    @ResponseBody
    public List<Idioma> verIdioma() {
        return idiServ.verIdioma();
    }
    
   @GetMapping ("/ver/idioma/{id}")
   @ResponseBody
   public Idioma findIdioma (@PathVariable Long id){
       return idiServ.findIdioma(id);
    }
    
    @DeleteMapping ("/delete/idioma/{id}")
    public void deleteIdioma (@PathVariable Long id){
        idiServ.deleteIdioma(id);
    }
    
    
    @PutMapping ("edit/idioma")
    public void updateIdioma (@RequestBody Idioma idi){
        idiServ.updateIdioma(idi);
    }
    
}
