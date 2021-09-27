package com.example.clinicaDental.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Odontologo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Odontologo extends Base {

    /* ======== atributos ======== */

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "matricula")
    private String matricula;

    /* ======== relaciones ======== */


    @OneToMany(mappedBy = "odontologo")
    @JsonIgnore
    private Set<Turno> turnos;


}
