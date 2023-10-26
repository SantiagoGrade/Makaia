package com.example.clinica.odontologica.repository;

import com.example.clinica.odontologica.model.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteRepository extends CrudRepository<Paciente, Integer> {
}
