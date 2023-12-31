package com.example.clinica.odontologica.service;

import com.example.clinica.odontologica.model.Odontologo;
import com.example.clinica.odontologica.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OdontologoService {
    //[Servicio] -> [repositoryio]
    @Autowired
    private OdontologoRepository odontologoRepository;


    public Odontologo crear(Odontologo odontologo) {
        if(odontologo.getMatricula() == null) {
            throw  new IllegalArgumentException("La matricula esta nula");
        }

        return odontologo;
    }

    public Odontologo obtenerOdontologo (Integer matricula){
        if (matricula <= 0){
            throw new IllegalArgumentException("La matricula esta nula");
        }
        Optional<Odontologo> odontologoOptional = this.odontologoRepository.findById(matricula);
        if (odontologoOptional.isPresent()){
            return odontologoOptional.get();
        }
        throw new RuntimeException("No hay ningun odontologo para esta matricula");
    }
}
