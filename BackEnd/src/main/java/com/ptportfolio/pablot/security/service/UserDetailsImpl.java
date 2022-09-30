package com.ptportfolio.pablot.security.service;

import com.ptportfolio.pablot.security.Entity.EUsuario;
import com.ptportfolio.pablot.security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {
    @Autowired SUsuarioService sUsuarioService;

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        EUsuario eUsuario = sUsuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.build(eUsuario);
    }
}
