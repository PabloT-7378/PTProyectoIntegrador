package com.ptportfolio.pablot.service;

import com.ptportfolio.pablot.models.Experiencia;
import com.ptportfolio.pablot.repository.ExperienciaRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    
    @Autowired ExperienciaRepo experienciaRepo;
    
    public List<Experiencia> list() {
        return experienciaRepo.findAll();
    }
    
    public Optional<Experiencia> getOne(int id) {
        return experienciaRepo.findById(id);
    }
    
    public Optional<Experiencia> getByTituloExp(String tituloExp) {
        return experienciaRepo.findByTituloExp(tituloExp);
    }
    
    public void save(Experiencia experiencia) {
        experienciaRepo.save(experiencia);
    }
    
    public void delete(int id) {
        experienciaRepo.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return experienciaRepo.existsById(id);
    }
    
    public boolean existsByTituloExp(String tituloExp) {
        return experienciaRepo.existsByTituloExp(tituloExp);
    }
}
