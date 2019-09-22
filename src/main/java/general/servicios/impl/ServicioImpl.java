/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general.servicios.impl;

import general.DAO.Dao;
import general.DTO.Estudiante;
import general.DTO.Persona;
import general.DTO.Profesor;
import general.servicios.Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Yesion Aristizabal 
 * 
 * Los servicios son usadon para colocar parte de la logica de la empresa ya dicional una capa mas de abstración
 * que permite cierta modularida de la aplicaciòn
 */
public class ServicioImpl implements Servicio{
    @Autowired 
    private Dao dao;

    @Override
    public void poblarListas() {
       dao.poblarListas();
    }

    @Override
    public List<Persona> listarPersonas() {
        return dao.listarPersonas();
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return dao.listarEstudiantes();
    }

    @Override
    public List<Profesor> listarProfesores() {
        return dao.listarProfesores();
    }
}
