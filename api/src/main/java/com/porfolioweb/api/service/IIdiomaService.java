
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Idioma;
import java.util.List;

public interface IIdiomaService {
        public List<Idioma> verIdioma();
    public void createIdioma (Idioma idi);
    public void updateIdioma (Idioma idi);
    public void deleteIdioma (Long id);
    public Idioma findIdioma(Long id);
}
