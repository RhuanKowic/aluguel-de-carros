package br.com.aluguel_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aluguel_carros.model.Rent;

public interface RentRepositorio extends JpaRepository<Rent, Long>{
  
}
