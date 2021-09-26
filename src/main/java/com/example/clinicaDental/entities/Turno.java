package com.example.clinicaDental.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String fechaTurno;

    @Column(name = "hora_turno")
    private String horaTurno;

    /* ======== relaciones ======== */

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_paciente", nullable = false)
    private Paciente paciente;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "fk_odontologo", nullable = false)
    private Odontologo odontologo;

}