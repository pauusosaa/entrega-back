package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.dto.TurnoDTO;
import com.example.clinicaDental.entities.Paciente;
import com.example.clinicaDental.entities.Turno;
import com.example.clinicaDental.repositories.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.logging.Logger;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    Logger logger = Logger.getLogger(String.valueOf(TurnoService.class));

    @Transactional
    public TurnoDTO save(TurnoDTO turnoDTO){
        logger.info("Se va a registrar un nuevo turno");
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
        return mapper.convertValue(turno, TurnoDTO.class);
    }

    @Transactional
    public Collection<TurnoDTO> getAll(){
        logger.info("Se van a listar los turnos existentes");
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDTO> turnosDTO = new HashSet<>();
        for(Turno turno : turnos){
            TurnoDTO turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
            turnosDTO.add(turnoDTO);
        }
        return turnosDTO;
    }



    @Override
    @Transactional
    public void delete(Long id){
        turnoRepository.deleteById(id);
    }
}
