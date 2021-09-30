package com.example.clinicaDental.dto;


import com.example.clinicaDental.entities.Odontologo;
import com.example.clinicaDental.entities.Paciente;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class TurnoDTO {

    private Long id;
    private LocalDate fechaTurno; //(yyyy-MM-dd)
    private LocalTime horaTurno; //"HH:MM"
    private Paciente paciente;
    private Odontologo odontologo;

}
