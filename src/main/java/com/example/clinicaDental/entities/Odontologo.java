package com.example.clinicaDental.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    @JsonBackReference
    @OneToMany(mappedBy = "odontologo")
    private List<Turno> turnos = new ArrayList<Turno>();

}
