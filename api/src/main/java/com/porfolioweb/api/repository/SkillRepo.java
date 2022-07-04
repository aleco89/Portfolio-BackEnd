
package com.porfolioweb.api.repository;

import com.porfolioweb.api.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository <Skill, Long> {
    
}
