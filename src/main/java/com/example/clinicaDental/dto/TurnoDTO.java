package com.example.clinicaDental.dto;


import com.example.clinicaDental.entities.Odontologo;
import com.example.clinicaDental.entities.Paciente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TurnoDTO {

    private Long id;
    private String fechaTurno;
    private String horaTurno;
    private Paciente paciente;
    private Odontologo odontologo;

}
