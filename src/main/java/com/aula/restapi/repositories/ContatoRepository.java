package com.aula.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.restapi.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato,Long> {
    
}
