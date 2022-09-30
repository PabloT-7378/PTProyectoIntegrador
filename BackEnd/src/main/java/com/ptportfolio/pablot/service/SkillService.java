package com.ptportfolio.pablot.service;

import com.ptportfolio.pablot.models.Skill;
import com.ptportfolio.pablot.repository.SkillRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillService {
    
    @Autowired SkillRepo skillRepo;
    
   public List<Skill> list() {
       return skillRepo.findAll();
   } 
   
   public Optional<Skill> getOne(int id) {
       return skillRepo.findById(id);
   }
   
   public Optional<Skill> getByNombreSkill(String nombreSkill) {
       return skillRepo.findByNombreSkill(nombreSkill);
   }
   
   public void save(Skill skill) {
       skillRepo.save(skill);
   }
   
   public void delete(int id) {
       skillRepo.deleteById(id);
   }
   
   public boolean existsById(int id) {
       return skillRepo.existsById(id);
   }
   
   public boolean existsByNombreSkill(String nombreSkill) {
       return skillRepo.existsByNombreSkill(nombreSkill);
   }
   
}
