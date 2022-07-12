
package com.porfolioweb.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Skill {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String skill;
    
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="persona_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private Persona persona;
    @ManyToOne (fetch=FetchType.LAZY)
    @JoinColumn(name="porcentaje_skill_id")
    @JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
    private PorcentajeSkill porcentajeSkill;

    public Skill() {
    }

    public Skill(Long id, String skill, Persona persona, PorcentajeSkill porcentajeSkill) {
        this.id = id;
        this.skill = skill;
        this.persona = persona;
        this.porcentajeSkill = porcentajeSkill;
    }    
        
}
