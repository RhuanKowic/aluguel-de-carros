package br.com.aluguel_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aluguel_carros.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
  
}
