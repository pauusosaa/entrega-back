package com.example.clinicaDental.dto;

import com.example.clinicaDental.entities.Direccion;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Integer DNI;
    private String fechaIngreso;

    private Direccion direccion;


}
