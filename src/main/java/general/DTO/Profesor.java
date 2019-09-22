package general.DTO;


import java.util.Date;
import lombok.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeison Aristizabal
 */
@Data
public class Profesor extends Persona {
    private String tituloAcademico;
    private String caseDictada;
    private Date anioInicio;
    private Long salario;
}
