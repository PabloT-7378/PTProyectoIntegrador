package com.ptportfolio.pablot.security.repository;

import com.ptportfolio.pablot.security.Entity.Rol;
import com.ptportfolio.pablot.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
