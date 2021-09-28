package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.DireccionDTO;
import java.util.*;

public interface IDireccionService {

    public DireccionDTO findById(Long id);
    public void update(Long id, DireccionDTO direccionDTO);
    public void delete(Long id);
    public Collection<DireccionDTO> getAll();

}
