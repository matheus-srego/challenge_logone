package com.teste.pratico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.pratico.models.Opening;

@Repository
public interface OpeningRepository extends JpaRepository<Opening, Long> {

}
