package com.ptportfolio.pablot.service;

import com.ptportfolio.pablot.interfas.IUsuarioService;
import com.ptportfolio.pablot.models.Usuario;
import com.ptportfolio.pablot.repository.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired UsuarioRepo usuarioRepo;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> usuario = usuarioRepo.findAll();
        return usuario;
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioRepo.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = usuarioRepo.findById(id).orElse(null);
        return usuario;
    }
    
   
}
