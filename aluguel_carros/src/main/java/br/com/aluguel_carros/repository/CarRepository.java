package br.com.aluguel_carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aluguel_carros.model.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
  
}
