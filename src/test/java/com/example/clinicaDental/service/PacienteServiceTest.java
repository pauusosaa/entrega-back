package com.example.clinicaDental.service;

import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.entities.Direccion;
import com.example.clinicaDental.entities.Paciente;
import com.example.clinicaDental.services.IPacienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PacienteServiceTest {

    @Autowired
    IPacienteService pacienteService;

    @Test
    public void test(){

        Direccion direc = new Direccion();
        direc.setProvincia("Mendoza");
        direc.setLocalidad("Godoy Cruz");
        direc.setCalle("Bernardo Houssay");
        direc.setNumero("123");

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setDireccion(direc);
        pacienteDTO.setNombre("Paulina");
        pacienteDTO.setApellido("Sosa");
        pacienteDTO.setFechaIngreso("02/09/21");
        pacienteDTO.setDNI(41418234);

        pacienteService.save(pacienteDTO);


        pacienteService.save(pacienteDTO);


        Set<PacienteDTO> pacienteDTOS = pacienteService.getPacienteByApellido("Sosa");

        boolean resultado = pacienteDTOS.size()>0;

        assertTrue(resultado);



    }
}
