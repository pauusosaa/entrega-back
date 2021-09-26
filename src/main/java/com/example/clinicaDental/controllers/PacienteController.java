package com.example.clinicaDental.controllers;

import com.example.clinicaDental.entities.Paciente;
import com.example.clinicaDental.services.PacienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "pacientes/")
public class PacienteController extends  BaseControllerImpl<Paciente, PacienteServiceImpl> {
}

