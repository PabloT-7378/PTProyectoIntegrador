package com.ptportfolio.pablot.security.service;

import com.ptportfolio.pablot.security.Entity.EUsuario;
import com.ptportfolio.pablot.security.repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SUsuarioService {
    @Autowired IUsuarioRepository iUsuarioRepository;
    
    public Optional<EUsuario> getByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario) {
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email) {
        return iUsuarioRepository.existsByEmail(email);
    }
    
    public void save(EUsuario eUsuario) {
        iUsuarioRepository.save(eUsuario);
    }
}
