package com.example.clinicaDental.services;

import com.example.clinicaDental.entities.Turno;
import com.example.clinicaDental.repositories.BaseRepository;
import com.example.clinicaDental.repositories.ITurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoServiceImpl extends BaseServiceImpl<Turno, Long> implements TurnoService{
    @Autowired
    private ITurnoRepository turnoRepository;


    public TurnoServiceImpl(BaseRepository<Turno, Long> baseRepository) {
        super(baseRepository);
    }
}