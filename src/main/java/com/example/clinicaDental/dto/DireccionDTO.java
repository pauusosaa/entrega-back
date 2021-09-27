package com.example.clinicaDental.dto;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class DireccionDTO {


    private Long id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;

}
