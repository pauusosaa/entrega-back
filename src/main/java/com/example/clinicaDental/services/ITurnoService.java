package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.TurnoDTO;
import java.util.Collection;


public interface ITurnoService {

    public TurnoDTO save(TurnoDTO turnoDTO);
    public Collection<TurnoDTO> getAll();
}
