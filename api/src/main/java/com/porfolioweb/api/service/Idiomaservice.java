
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Idioma;
import com.porfolioweb.api.repository.IdiomaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Idiomaservice implements IIdiomaService{

    @Autowired
    public IdiomaRepo idiRepo;
    
    @Override
    public List<Idioma> verIdioma() {
        return idiRepo.findAll();
    }

    @Override
    public void createIdioma(Idioma idi) {
        idiRepo.save(idi);
    }

    @Override
    public void updateIdioma(Idioma idi) {
        idiRepo.save(idi);
    }

    @Override
    public void deleteIdioma(Long id) {
        idiRepo.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
       return idiRepo.findById(id).orElse(null);
    }
    
}
