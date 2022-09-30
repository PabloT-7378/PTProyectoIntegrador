package com.ptportfolio.pablot.repository;

import com.ptportfolio.pablot.models.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SkillRepo extends JpaRepository<Skill, Integer> {
    Optional<Skill> findByNombreSkill(String nombreSkill);
    public boolean existsByNombreSkill(String nombreSkill);
}
