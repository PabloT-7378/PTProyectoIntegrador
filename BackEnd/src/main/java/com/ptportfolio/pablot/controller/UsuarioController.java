package com.ptportfolio.pablot.controller;

import com.ptportfolio.pablot.models.Usuario;
import com.ptportfolio.pablot.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://frontendpt-1.web.app")
public class UsuarioController {
    
    @Autowired UsuarioService usuarioService;
    
    @GetMapping("/usuario/traer")
    public List<Usuario> getPersona() {
        return usuarioService.getUsuario();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/usuario/crear")
    public String createUsuario(@RequestBody Usuario usuario) {
        usuarioService.saveUsuario(usuario);
        return "usuario creado";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/usuario/delete/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);
        return "usuario eliminado";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/usuario/edit/{id}")
    public Usuario editUsuario(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("descripcion") String nuevoDescripcion,
                               @RequestParam("imagenPerfil") String nuevoImagenPerfil) {
        Usuario usuario = usuarioService.findUsuario(id);
        
        usuario.setNombre(nuevoNombre);
        usuario.setApellido(nuevoApellido);
        usuario.setTitulo(nuevoTitulo);
        usuario.setDescripcion(nuevoDescripcion);
        usuario.setImagenPerfil(nuevoImagenPerfil);
        
        usuarioService.saveUsuario(usuario);
        return usuario;
    }
    
    @GetMapping("/usuario/traer/perfil")
    public Usuario findUsuario() {
        return usuarioService.findUsuario((long)1);
    }
}
