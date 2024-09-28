package com.teste.pratico.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.pratico.models.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
