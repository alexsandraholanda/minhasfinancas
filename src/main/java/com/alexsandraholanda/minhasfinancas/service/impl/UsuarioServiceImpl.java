package com.alexsandraholanda.minhasfinancas.service.impl;

import com.alexsandraholanda.minhasfinancas.service.UsuarioService;
import com.alexsandraholanda.model.entity.Usuario;
import com.alexsandraholanda.model.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario validarEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
