package com.ptportfolio.pablot.interfas;

import com.ptportfolio.pablot.models.Usuario;
import java.util.List;


public interface IUsuarioService {
    //traer usuario
    public List<Usuario> getUsuario();
    //guardar usuario
    public void saveUsuario(Usuario usuario);
    //eliminar usuario
    public void deleteUsuario(Long id);
    //buscar usuario
    public Usuario findUsuario(Long id);
}
