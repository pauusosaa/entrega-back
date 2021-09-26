package com.example.clinicaDental.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Paciente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Paciente extends Base {

    /* ======== atributos ======== */

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private Integer DNI;

    @Column(name = "fecha_ingreso")
    private String fechaIngreso;

    /* ======== relaciones ======== */

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion" , referencedColumnName = "id")
    private Direccion direccion;

    @JsonManagedReference
    @OneToMany(mappedBy = "paciente",
               cascade = CascadeType.ALL,
                orphanRemoval = true)
    private List<Turno> turnos = new ArrayList<Turno>();

}
