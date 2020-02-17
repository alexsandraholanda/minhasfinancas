package com.alexsandraholanda.minhasfinancas.service;

import com.alexsandraholanda.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	Usuario validarEmail(String email);

}
