
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> verProyecto();
    public void createProyecto (Proyecto proy);
    public void updateProyecto (Proyecto proy);
    public void deleteProyecto (Long id);
    public Proyecto findProyecto(Long id);
}
