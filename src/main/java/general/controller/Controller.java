/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general.controller;

import general.DTO.Estudiante;
import general.DTO.Persona;
import general.DTO.Profesor;
import general.servicios.Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yeison Aristizabal
 */
@RestController
public class Controller {
    
    @Autowired
    private Servicio servicio; 
    
    /**
     * @author Yeison Aristizabal
     * @return Listar personas
     */
    @RequestMapping(value = "/persona/listar", method = RequestMethod.GET)
    public List<Persona> listarPersonas() {
        return servicio.listarPersonas();
    }
    
    /**
     * @author Yeison Aristizabal
     * @return Listar estudiantes
     */
    @RequestMapping(value = "/estudiante/listar", method = RequestMethod.GET)
    public List<Estudiante> listarEstudiantes() {
        return servicio.listarEstudiantes();
    }
    
    /**
     * @author Yeison Aristizabal
     * @return Listar profesores
     */
    @RequestMapping(value = "/profesores/listar", method = RequestMethod.GET)
    public List<Profesor> listarProfesores() {
        return servicio.listarProfesores();
    }
}
