package com.example.clinica.odontologica.controller;

import com.example.clinica.odontologica.model.Paciente;
import com.example.clinica.odontologica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clinica/v1")
public class PacienteController {

    private PacienteService pacienteService;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping("/paciente")
    public Paciente crearPaciente(@RequestBody Paciente paciente){
        return this.pacienteService.crearPaciente(paciente);
    }

}
