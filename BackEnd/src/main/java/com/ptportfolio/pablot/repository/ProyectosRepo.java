package com.ptportfolio.pablot.repository;

import com.ptportfolio.pablot.models.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProyectosRepo extends JpaRepository<Proyectos, Integer> {
    public Optional<Proyectos> findByNombreProyec(String nombreProyec);
    public boolean existsByNombreProyec(String nombreProyec);
}
