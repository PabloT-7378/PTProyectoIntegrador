package com.ptportfolio.pablot.repository;

import com.ptportfolio.pablot.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
    
}
