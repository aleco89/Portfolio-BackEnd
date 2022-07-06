
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.NivelIdioma;
import com.porfolioweb.api.repository.NivelIdiomaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NivelIdiomaService implements INivelIdiomaService{
    
    @Autowired
    public NivelIdiomaRepo niRepo;   

    @Override
    public List<NivelIdioma> verNivelIdioma() {
        return niRepo.findAll();
    }

    @Override
    public void createNivelIdioma(NivelIdioma ni) {
        niRepo.save(ni);
    }

    @Override
    public NivelIdioma findNivelIdioma (Long id) {
        return niRepo.findById(id).orElse(null);
    }

    @Override
    public void updateNivelIdioma(NivelIdioma per) {
        niRepo.save(per);
    }
   
    
    @Override
    public void deleteNivelIdioma(Long id) {
        niRepo.deleteById(id);
    }
}
