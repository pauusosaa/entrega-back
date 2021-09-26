package com.example.clinicaDental.services;


import com.example.clinicaDental.entities.Direccion;
import com.example.clinicaDental.repositories.BaseRepository;
import com.example.clinicaDental.repositories.IDireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DireccionServiceImpl  extends BaseServiceImpl<Direccion, Long> implements DireccionService{

    @Autowired
    private IDireccionRepository direccionRepository;

    public DireccionServiceImpl(BaseRepository<Direccion, Long> baseRepository, IDireccionRepository direccionRepository) {
        super(baseRepository);
        this.direccionRepository = direccionRepository;
    }
}
