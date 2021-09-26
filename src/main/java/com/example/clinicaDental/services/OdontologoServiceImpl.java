package com.example.clinicaDental.services;

import com.example.clinicaDental.entities.Odontologo;
import com.example.clinicaDental.repositories.BaseRepository;
import com.example.clinicaDental.repositories.IOdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OdontologoServiceImpl  extends BaseServiceImpl<Odontologo, Long> implements OdontologoService{

    @Autowired
    private IOdontologoRepository odontologoRepository;

    public OdontologoServiceImpl(BaseRepository<Odontologo, Long> baseRepository, IOdontologoRepository odontologoRepository) {
        super(baseRepository);
        this.odontologoRepository = odontologoRepository;
    }
}
