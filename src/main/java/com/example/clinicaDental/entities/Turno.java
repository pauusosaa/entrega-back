package com.example.clinicaDental.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "Turno")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Turno extends Base{

    /* ======== atributos ======== */

    @Column(name = "fecha_turno")
    private LocalDate fechaTurno;

    @Column(name = "hora_turno")
    private LocalTime horaTurno;

    /* ======== relaciones ======== */

    @ManyToOne
    @JoinColumn(name = "odontologo_fk", nullable = false)
    private Odontologo odontologo;

    @ManyToOne
    @JoinColumn(name = "paciente_fk", nullable = false)
    private Paciente paciente;

}