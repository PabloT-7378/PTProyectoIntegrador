package com.ptportfolio.pablot.security.repository;

import com.ptportfolio.pablot.security.Entity.EUsuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<EUsuario, Integer> {
    Optional<EUsuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
