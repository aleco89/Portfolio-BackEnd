
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.InstitucionEmpresa;
import java.util.List;


public interface IInstitucionEmpresaService {
    public List<InstitucionEmpresa> verInstitucionEmpresa();
    public void createInstitucionEmpresa (InstitucionEmpresa ie);
    public void updateInstitucionEmpresa (InstitucionEmpresa ie);
    public void deleteInstitucionEmpresa (Long id);
    public InstitucionEmpresa findInstitucionEmpresa (Long id);
}
