package com.example.clinicaDental.controllers;

import com.example.clinicaDental.entities.Direccion;
import com.example.clinicaDental.services.DireccionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "direcciones/")
public class DireccionController extends  BaseControllerImpl<Direccion, DireccionServiceImpl> {
}
