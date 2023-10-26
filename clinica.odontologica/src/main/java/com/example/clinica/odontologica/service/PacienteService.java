package com.example.clinica.odontologica.service;

import com.example.clinica.odontologica.model.Odontologo;
import com.example.clinica.odontologica.model.Paciente;
import com.example.clinica.odontologica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    public PacienteRepository pacienteRepository;

    public Paciente crearPaciente(Paciente paciente){
        if (paciente.getDni() == null){
            throw new IllegalArgumentException("El dni esta nulo");
        }
        return paciente;

    }

    public Paciente obtenerpaciente(Integer dni){
        if(dni <= 0){
            throw new IllegalArgumentException("La dni esta nula");
        }
        Optional<Paciente> pacienteOptional = this.pacienteRepository.findById(dni);
        if(pacienteOptional.isPresent()){
            return pacienteOptional.get();
        }
        throw new IllegalArgumentException("No hay pacientes con ese dni");
    }


}
