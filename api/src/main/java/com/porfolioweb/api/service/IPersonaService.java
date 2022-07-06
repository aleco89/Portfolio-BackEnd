
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> verPersonas();
    public void createPersona (Persona per);
    public void updatePersona (Persona per);
    public void deletePersona (Long id);
    public Persona findPersona(Long id);
       
}
