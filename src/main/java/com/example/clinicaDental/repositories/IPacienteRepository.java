package com.example.clinicaDental.repositories;

import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.entities.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IPacienteRepository  extends BaseRepository<Paciente,Long > {

    @Query("from Paciente p where p.apellido like %:apellido%")
    List<Paciente> getPacienteByApellido(@Param("apellido") String apellido);


}

