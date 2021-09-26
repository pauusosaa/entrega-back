package com.example.clinicaDental.controllers;

import com.example.clinicaDental.entities.Turno;
import com.example.clinicaDental.services.TurnoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "turnos/")
public class TurnoController extends  BaseControllerImpl<Turno, TurnoServiceImpl>{
}
