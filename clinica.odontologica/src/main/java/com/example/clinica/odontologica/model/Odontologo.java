package com.example.clinica.odontologica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "odontologo")
public class Odontologo {

    @Id
    @Column(name = "matricula")
    private Integer matricula;

    @Column(name = "nombre", length = 200, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 200, nullable = false)
    private String apellido;

    public Odontologo(){

    }

    public Odontologo(Integer matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


}
