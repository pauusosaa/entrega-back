package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.OdontologoDTO;
import com.example.clinicaDental.entities.Odontologo;

import java.util.*;

public interface IOdontologoService {

    public OdontologoDTO save(OdontologoDTO odontologoDTO);
    public OdontologoDTO findById(Long id) ;
    public void update(Long id, OdontologoDTO odontologoDTO);
    public void delete(Long id);
    public Collection<OdontologoDTO> getAll();
}
