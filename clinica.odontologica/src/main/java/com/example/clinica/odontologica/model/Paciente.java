package com.example.clinica.odontologica.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "paciente")
public class Paciente {

    @Id
    @Column(name = "dni")
    private Integer dni;

    @Column (name = "nombre", nullable = false)
    private String nombre;

    @Column (name ="apellido", nullable = false)
    private String apellido;

    @Column (name = "domicilio", nullable = false)
    private String domicilio;

    public Paciente(){

    }

    public Paciente(Integer dni, String nombre, String apellido, String domicilio){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
