package com.example.clinicaDental.repositories;

import com.example.clinicaDental.entities.Paciente;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository  extends BaseRepository<Paciente,Long > {
}

