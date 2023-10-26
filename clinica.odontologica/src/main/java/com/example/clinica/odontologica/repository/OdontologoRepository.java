package com.example.clinica.odontologica.repository;


import com.example.clinica.odontologica.model.Odontologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Generalmente lo que va en la carpeta repository es una interfaz
@Repository
public interface OdontologoRepository extends CrudRepository<Odontologo, Integer>{

}
