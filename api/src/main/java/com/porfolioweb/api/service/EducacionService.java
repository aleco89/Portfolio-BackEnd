
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Educacion;
import com.porfolioweb.api.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepo eduRepo;

        
    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void createEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void updateEducacion(Educacion edu) {      
        eduRepo.save(edu);
    }
    
    /*    public void modificar(Habilidad habilidad)throws HabilidadNotFoundException {
        Habilidad guardada=traer(habilidad.getId());
        if(guardada!=null){
            guardada.setNombre(habilidad.getNombre());
            guardada.setDescripcion(habilidad.getDescripcion());
            guardada.setPorcentaje(habilidad.getPorcentaje());
            habilidadRepo.save(guardada);
        }
    }
     public void editarProyecto (Long id, Proyecto pro){
         proyectoRepo.findById(id).map( editExpe -> {
         editExpe.setTitulo(pro.getTitulo());
         editExpe.setImagen(pro.getImagen());
         editExpe.setDescripcion(pro.getDescripcion());

         return proyectoRepo.save(editExpe);
      });
    
    */ 
    
    
    @Override
    public void deleteEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
}
