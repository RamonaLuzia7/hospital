package com.senai.backend.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.backend.hospital.models.Horario;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {
   
}
