package com.alexsandraholanda.model.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandraholanda.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, BigDecimal> {

}
