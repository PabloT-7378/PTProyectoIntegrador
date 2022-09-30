package com.ptportfolio.pablot.security.service;

import com.ptportfolio.pablot.security.Entity.Rol;
import com.ptportfolio.pablot.security.enums.RolNombre;
import com.ptportfolio.pablot.security.repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class RolService {
    @Autowired IRolRepository iRolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return iRolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
