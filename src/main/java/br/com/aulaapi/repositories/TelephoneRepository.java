package br.com.aulaapi.repositories;

import br.com.aulaapi.entities.Phone;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TelephoneRepository extends JpaRepository<Phone, Long>{
}
