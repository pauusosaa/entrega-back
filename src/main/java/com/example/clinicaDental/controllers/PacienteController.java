package com.example.clinicaDental.controllers;

import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

import org.apache.log4j.*;

@CrossOrigin
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    Logger logger = Logger.getLogger(String.valueOf(PacienteController.class));

    @Autowired
    IPacienteService pacienteService;

    @GetMapping("/list")
    public ResponseEntity<?> getAll(){
        try {
            logger.info("Se esta por realizar una llamada al service para buscar los pacientes");
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.getAll());
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            logger.info("Se esta por realizar una llamada al service para buscar un paciente con id: " + id);
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.findById(id));
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody PacienteDTO pacienteDTO){
        try {
            logger.info("Se esta por realizar una llamada al service para guardar un paciente");
            return ResponseEntity.status(HttpStatus.OK).body(pacienteService.save(pacienteDTO));
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody PacienteDTO pacienteDTO){
        logger.info("Se esta por realizar una llamada al service para modificar el paciente con id: "+ id);
        pacienteService.update(id, pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        logger.info("Se esta por realizar una llamada al service para eliminar el paciente con id: " + id);
        pacienteService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("list-apellido")
    public Set<PacienteDTO> getPacienteByApellido(@RequestParam String apellido){
        return pacienteService.getPacienteByApellido(apellido);
    }
}
