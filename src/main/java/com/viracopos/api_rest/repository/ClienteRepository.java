package com.viracopos.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viracopos.api_rest.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
     
}
