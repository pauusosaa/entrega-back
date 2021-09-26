package com.example.clinicaDental.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
