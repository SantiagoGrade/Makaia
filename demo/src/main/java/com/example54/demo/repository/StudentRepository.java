package com.example54.demo.repository;

import com.example54.demo.model.Student;

import java.util.List;

public interface StudentRepository {

    //Traer todos los objetos de la entidad student
    List<Student> findAll();

    //buscar un student por un id
    Student findById(Long id);

    //crear un estudiante
    Student create(Student student);

    //actualizar un student por medio de un id
    Student update(Long id, Student student);

    //eliminar un student por su id
    Boolean deleteStudent(Long id);





}
