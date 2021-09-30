package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.TurnoDTO;
import com.example.clinicaDental.entities.Turno;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;


public interface ITurnoService {

    public TurnoDTO save(TurnoDTO turnoDTO);
    public Collection<TurnoDTO> getAll();
    public void delete(Long id);
}
