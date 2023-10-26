package com.example.clinica.odontologica.controller;

import com.example.clinica.odontologica.model.Odontologo;
import com.example.clinica.odontologica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clinica/v1")
public class OdontologoController {
    //Se comunica con:
    private OdontologoService odontologoService;

    //[controlador] -> [Servicio]
    @Autowired
    public OdontologoService getOdontologoService() {
        return odontologoService;
    }

    @PostMapping("/odontologo")
    public Odontologo crear(@RequestBody Odontologo odontologo){
        return this.odontologoService.crear(odontologo);
    }
}
