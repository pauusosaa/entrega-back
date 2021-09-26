package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.PacienteDTO;


import java.util.*;

public interface IPacienteService {

    public PacienteDTO save(PacienteDTO pacienteDTO);
    public PacienteDTO findById(Long id) ;
    public void update(Long id,PacienteDTO pacienteDTO);
    public void delete(Long id);
    public Collection<PacienteDTO> getAll();
    public Set<PacienteDTO> getPacienteByApellido(String apellido);
}
