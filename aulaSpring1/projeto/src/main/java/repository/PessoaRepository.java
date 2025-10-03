package com.example.projeto.repository;

import org.springframework.data.jap.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{}