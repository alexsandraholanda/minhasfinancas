package com.alexsandraholanda.model.repository;

import java.math.BigDecimal;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alexsandraholanda.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, BigDecimal>{

}
