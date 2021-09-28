package com.example.clinicaDental.service;

import com.example.clinicaDental.dto.OdontologoDTO;
import com.example.clinicaDental.services.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    IOdontologoService odontologoService;

    @Test
    public void test(){
        OdontologoDTO odontologo = new OdontologoDTO();
        odontologo.setApellido("Sosa");
        odontologo.setNombre("Paulina");
        odontologo.setMatricula("MatriculaPrueba");

        odontologoService.save(odontologo);

        Collection<OdontologoDTO> odontologos = odontologoService.getAll();
        boolean resultado = odontologos.size() > 0 && odontologos.size()<2;

        assertTrue(resultado);


    }

}
