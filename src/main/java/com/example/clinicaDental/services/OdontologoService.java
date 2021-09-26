package com.example.clinicaDental.services;

import com.example.clinicaDental.dto.OdontologoDTO;
import com.example.clinicaDental.entities.Odontologo;
import com.example.clinicaDental.repositories.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class OdontologoService  implements  IOdontologoService{

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    @Transactional
    public OdontologoDTO save(OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
        return mapper.convertValue(odontologo, OdontologoDTO.class);
    }

    @Override
    @Transactional
    public OdontologoDTO findById(Long id) {
        OdontologoDTO odontologoDTO = null;
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        if(odontologo.isPresent()){
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        }
        return odontologoDTO;
    }

    @Override
    @Transactional
    public void update(Long id, OdontologoDTO odontologoDTO){
        Optional<Odontologo> o = odontologoRepository.findById(id);
        if (o.isPresent()){
            Odontologo od = o.get();
            od.setNombre(odontologoDTO.getNombre());
            od.setApellido(odontologoDTO.getApellido());
            od.setMatricula(odontologoDTO.getMatricula());
            odontologoRepository.save(od);
        }
    }

    @Override
    @Transactional
    public void delete(Long id){
        odontologoRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Collection<OdontologoDTO> getAll(){
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for(Odontologo odontologo : odontologos){
            OdontologoDTO odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
            odontologosDTO.add(odontologoDTO);
        }
        return odontologosDTO;
    }
}
