package com.example.clinicaDental.controllers;

import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @GetMapping("/list")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.getAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody PacienteDTO pacienteDTO){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.save(pacienteDTO));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO){
        pacienteService.update(id, pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        pacienteService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("list-apellido")
    public Set<PacienteDTO> getPacienteByApellido(@RequestParam String apellido){
        return pacienteService.getPacienteByApellido(apellido);
    }
}
