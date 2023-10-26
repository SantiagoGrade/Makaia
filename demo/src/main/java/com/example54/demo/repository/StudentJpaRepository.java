package com.example54.demo.repository;

import com.example54.demo.model.Student;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {

    @Query("SELECT e FROM student e JOIN e.course c WHERE c.name = :nombreCurso")
    List<Student> BuscarEstudiantesPorNombreCurso(String nombreCurso);




    //JPQL




}
