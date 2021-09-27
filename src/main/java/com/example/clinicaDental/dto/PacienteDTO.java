package com.example.clinicaDental.dto;

import com.example.clinicaDental.entities.Direccion;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer DNI;
    private String fechaIngreso;

    private Direccion direccion;


}
