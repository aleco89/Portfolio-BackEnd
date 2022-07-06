
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.NivelIdioma;
import java.util.List;


public interface INivelIdiomaService {
    public List<NivelIdioma> verNivelIdioma();
    public void createNivelIdioma (NivelIdioma ni);
    public void updateNivelIdioma (NivelIdioma ni);
    public void deleteNivelIdioma (Long id);
    public NivelIdioma findNivelIdioma (Long id);    
}
