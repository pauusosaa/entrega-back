package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.TurnoDTO;
import com.example.clinicaDental.entities.Turno;
import com.example.clinicaDental.repositories.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Transactional
    public TurnoDTO save(TurnoDTO turnoDTO){
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
        return mapper.convertValue(turno, TurnoDTO.class);
    }

    @Transactional
    public Collection<TurnoDTO> getAll(){
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDTO> turnosDTO = new HashSet<>();
        for(Turno turno : turnos){
            TurnoDTO turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
            turnosDTO.add(turnoDTO);
        }
        return turnosDTO;
    }
}
