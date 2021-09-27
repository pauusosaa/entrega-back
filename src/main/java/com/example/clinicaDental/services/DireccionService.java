package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.DireccionDTO;
import com.example.clinicaDental.entities.Direccion;
import com.example.clinicaDental.repositories.IDireccionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class DireccionService implements  IDireccionService{

    @Autowired
    IDireccionRepository direccionRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    @Transactional
    public DireccionDTO findById(Long id) {
        DireccionDTO direccionDTO = null;
        Optional<Direccion> direccion = direccionRepository.findById(id);
        if(direccion.isPresent()){
            direccionDTO = mapper.convertValue(direccion, DireccionDTO.class);
        }
        return direccionDTO;
    }

    @Override
    @Transactional
    public void update(Long id, DireccionDTO direccionDTO){
        Optional<Direccion> d = direccionRepository.findById(id);
        if (d.isPresent()){
            Direccion direc = d.get();
            direc.setCalle(direccionDTO.getCalle());
            direc.setNumero(direccionDTO.getNumero());
            direc.setLocalidad(direccionDTO.getLocalidad());
            direc.setProvincia(direccionDTO.getProvincia());
            direccionRepository.save(direc);
        }
    }

    @Override
    @Transactional
    public void delete(Long id){
        direccionRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Collection<DireccionDTO> getAll(){
        List<Direccion> direcciones = direccionRepository.findAll();
        Set<DireccionDTO> direccionesDTO = new HashSet<>();
        for(Direccion direccion : direcciones){
            DireccionDTO direccionDTO = mapper.convertValue(direccion, DireccionDTO.class);
            direccionesDTO.add(direccionDTO);
        }
        return direccionesDTO;
    }
}
