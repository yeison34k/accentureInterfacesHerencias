package general.DTO;

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
public class Estudiante extends Persona{
    private String estado;
    private String promedio;
    private String grado;
}
