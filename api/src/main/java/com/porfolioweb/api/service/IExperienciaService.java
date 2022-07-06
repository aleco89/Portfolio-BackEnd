
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> verExperiencia();
    public void createExperiencia (Experiencia exp);
    public void updateExperiencia (Experiencia exp);
    public void deleteExperiencia (Long id);
    public Experiencia findExperiencia (Long id);
}
