package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.DireccionDTO;
import com.example.clinicaDental.entities.Direccion;
import com.example.clinicaDental.repositories.IDireccionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.*;

public interface IDireccionService {

    public DireccionDTO findById(Long id);
    public void update(Long id, DireccionDTO direccionDTO);
    public void delete(Long id);
    public Collection<DireccionDTO> getAll();

}
