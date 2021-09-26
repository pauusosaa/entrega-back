package com.example.clinicaDental.services;

import com.example.clinicaDental.entities.Paciente;
import com.example.clinicaDental.repositories.BaseRepository;
import com.example.clinicaDental.repositories.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl extends BaseServiceImpl<Paciente, Long> implements PacienteService{

    @Autowired
    private IPacienteRepository pacienteRepository;

    public PacienteServiceImpl(BaseRepository<Paciente, Long> baseRepository, IPacienteRepository pacienteRepository) {
        super(baseRepository);
        this.pacienteRepository = pacienteRepository;
    }
}
