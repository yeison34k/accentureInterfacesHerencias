/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general.DAO;

import general.DTO.Estudiante;
import general.DTO.Persona;
import general.DTO.Profesor;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yeison Arsitizabal 
 */
@Repository
public interface Dao {
    
    /**
     * @author Yeison Arsitizabal 
     * USo de metodo para poblar las listas de personas, estudiantes y profesores
     */
    public void poblarListas();
    
    
    /**
     * @author Yeison Arsitizabal 
     * @return Listar personas 
     */
    public List<Persona> listarPersonas();
    
    /**
     * @author Yeison Arsitizabal 
     * @return Listar estudiantes
     */
    public List<Estudiante> listarEstudiantes();
    
    /**
     * @author Yeison Arsitizabal 
     * @return Listar profesores
     */
    public List<Profesor> listarProfesores();
}
