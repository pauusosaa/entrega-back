package com.example.clinicaDental.controllers;

import com.example.clinicaDental.entities.Odontologo;
import com.example.clinicaDental.services.OdontologoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "odontologos/")
public class OdontologoController extends  BaseControllerImpl<Odontologo, OdontologoServiceImpl>{
}
