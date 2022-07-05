
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void createEducacion (Educacion edu);
    public void updateEducacion (Educacion edu);
    public void deleteEducacion (Long id);
    public Educacion findEducacion(Long id);
}
