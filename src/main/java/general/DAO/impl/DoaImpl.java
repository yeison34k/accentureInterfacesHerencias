/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general.DAO.impl;

import general.DAO.Dao;
import general.DTO.Estudiante;
import general.DTO.Persona;
import general.DTO.Profesor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author  Yeison Aristizabal
 */
public class DoaImpl implements Dao {
    
    //Los array list son interfaces propias del api de java
    List<Persona> personas = new ArrayList<>();
    List<Estudiante> estudiantes = new ArrayList<>();
    List<Profesor> profesores = new ArrayList<>();
    
    @Override
    public void poblarListas() {
        for (int i = 0; i < 50; i++) {
            Persona persona = new Persona();//Case pricipal o clase padre 
            persona.setNombre("Yeison" + i);
            persona.setApellido("Aristizabal" + i);
            persona.setCiudad("Medellìn" + i);
            persona.setTelefono("313 627 5193"+ i);

            Estudiante estudiante = new Estudiante();//La calse estudiante hereda de la clase persona
            estudiante.setNombre("Estudiante"+ i);
            estudiante.setApellido(""+ i);
            estudiante.setCiudad("Medellìn"+ i);
            estudiante.setTelefono("313 627 5193"+ i);
            estudiante.setEstado("Activo");
            estudiante.setPromedio("7");
            estudiante.setGrado("11");
            
                    
            Profesor profesor = new Profesor();//La clase profesor hereda de la clase persona
            profesor.setNombre("profesor"+ i);
            profesor.setApellido("profesor"+ i);
            profesor.setCiudad("Medellìn"+ i);
            profesor.setTelefono("313 627 5193"+ i);
            profesor.setAnioInicio(new Date());
            profesor.setSalario(678580l+ i);
            profesor.setTituloAcademico("Ingeniero..."+ i);
            profesor.setCaseDictada("matemáticas"+ i);
                    
            personas.add(persona);
            estudiantes.add(estudiante);
            profesores.add(profesor);
        }
    }

    @Override
    public List<Persona> listarPersonas() {
        return personas;
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    @Override
    public List<Profesor> listarProfesores() {
        return profesores;
    }
}
