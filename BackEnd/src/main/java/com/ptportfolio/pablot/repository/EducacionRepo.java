package com.ptportfolio.pablot.repository;

import com.ptportfolio.pablot.models.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByTituloEdu(String tituloEdu);
    public boolean existsByTituloEdu(String tituloEdu);
}
