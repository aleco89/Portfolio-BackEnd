
package com.porfolioweb.api.service;

import com.porfolioweb.api.model.Persona;
import com.porfolioweb.api.repository.PersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepo persoRepo;   

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void createPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public Persona findPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void updatePersona(Persona per) {
        persoRepo.save(per);
    }

    /*
     public void editarEducacion (Long id, Educacion edu){
         educacionRepo.findById(id).map( editEdu -> {
         editEdu.setInstitucion(edu.getInstitucion());
         editEdu.setTitulo(edu.getTitulo());
         editEdu.setPeriodo(edu.getPeriodo());
         editEdu.setEstado(edu.getEstado());
         editEdu.setDetalles(edu.getDetalles());

         return educacionRepo.save(editEdu);
      });
    public void modificar(Habilidad habilidad)throws HabilidadNotFoundException {
        Habilidad guardada=traer(habilidad.getId());
        if(guardada!=null){
            guardada.setNombre(habilidad.getNombre());
            guardada.setDescripcion(habilidad.getDescripcion());
            guardada.setPorcentaje(habilidad.getPorcentaje());
            habilidadRepo.save(guardada);
        }
    }
    
    */
    
    
    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }
}
