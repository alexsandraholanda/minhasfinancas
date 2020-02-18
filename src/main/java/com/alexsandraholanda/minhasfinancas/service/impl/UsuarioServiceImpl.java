package com.alexsandraholanda.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexsandraholanda.minhasfinancas.exception.RegraNegocioException;
import com.alexsandraholanda.minhasfinancas.service.UsuarioService;
import com.alexsandraholanda.model.entity.Usuario;
import com.alexsandraholanda.model.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	
	private UsuarioRepository repository;
	@Autowired
	
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
		boolean existe = repository.existsByEmail(email);
		if (existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com esse Email.");
		}
		return null;
		
	}

}
