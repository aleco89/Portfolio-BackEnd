
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.InstitucionEmpresa;
import com.porfolioweb.api.repository.InstitucionEmpresaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitucionEmpresaService implements IInstitucionEmpresaService{
    
    @Autowired
    public InstitucionEmpresaRepo ieRepo;   

    @Override
    public List<InstitucionEmpresa> verInstitucionEmpresa() {
        return ieRepo.findAll();
    }

    @Override
    public void createInstitucionEmpresa(InstitucionEmpresa ie) {
        ieRepo.save(ie);
    }

    @Override
    public InstitucionEmpresa findInstitucionEmpresa(Long id) {
        return ieRepo.findById(id).orElse(null);
    }

    @Override
    public void updateInstitucionEmpresa (InstitucionEmpresa ie) {
        ieRepo.save(ie);
    }
 
    @Override
    public void deleteInstitucionEmpresa(Long id) {
        ieRepo.deleteById(id);
    }
}
