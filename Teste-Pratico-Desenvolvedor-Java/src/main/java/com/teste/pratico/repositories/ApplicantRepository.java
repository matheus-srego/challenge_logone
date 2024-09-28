package com.teste.pratico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.pratico.models.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
