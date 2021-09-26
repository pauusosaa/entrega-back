package com.example.clinicaDental.services;


import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.entities.Paciente;
import com.example.clinicaDental.repositories.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class PacienteService implements IPacienteService {

        @Autowired
        IPacienteRepository pacienteRepository;


        @Autowired
        ObjectMapper mapper;


        @Override
        @Transactional
        public PacienteDTO save(PacienteDTO pacienteDTO){
            Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
            pacienteRepository.save(paciente);
            return mapper.convertValue(paciente, PacienteDTO.class);
        }

        @Override
        @Transactional
        public PacienteDTO findById(Long id) {
            PacienteDTO pacienteDTO = null;
            Optional<Paciente> paciente = pacienteRepository.findById(id);
            if(paciente.isPresent()){
                pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
            }
            return pacienteDTO;
        }

        @Override
        @Transactional
        public void update(Long id, PacienteDTO pacienteDTO){
            Optional<Paciente> p = pacienteRepository.findById(id);
            if (p.isPresent()){
                Paciente pac = p.get();
                pac.setNombre(pacienteDTO.getNombre());
                pac.setApellido(pacienteDTO.getApellido());
                pac.setDNI(pacienteDTO.getDNI());
                pac.setFechaIngreso(pacienteDTO.getFechaIngreso());
                pacienteRepository.save(pac);
            }
        }

        @Override
        @Transactional
        public void delete(Long id){
            pacienteRepository.deleteById(id);
        }

        @Override
        @Transactional
        public Collection<PacienteDTO> getAll(){
            List<Paciente> pacientes = pacienteRepository.findAll();
            Set<PacienteDTO> pacientesDTO = new HashSet<>();
            for(Paciente paciente : pacientes){
                PacienteDTO pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
                pacientesDTO.add(pacienteDTO);
            }
            return pacientesDTO;
        }


        @Override
        @Transactional
        public Set<PacienteDTO> getPacienteByApellido(String apellido){
          Set <Paciente> pacientes = pacienteRepository.getPacienteByApellido(apellido);
          Set<PacienteDTO> pacientesDTO = new HashSet<>();
            for(Paciente paciente : pacientes){
                PacienteDTO pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
                pacientesDTO.add(pacienteDTO);
            }
            return pacientesDTO;
        }
    }

