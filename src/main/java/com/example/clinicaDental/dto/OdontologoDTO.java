package com.example.clinicaDental.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class OdontologoDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String matricula;

}
