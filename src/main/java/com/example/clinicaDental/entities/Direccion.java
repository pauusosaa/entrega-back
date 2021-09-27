package com.example.clinicaDental.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Direccion")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Direccion extends Base{

    /* ======== atributos =========*/

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private String numero;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "provincia")
    private String provincia;

}
