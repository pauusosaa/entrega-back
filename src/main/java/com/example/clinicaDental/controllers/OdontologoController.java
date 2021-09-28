package com.example.clinicaDental.controllers;

import com.example.clinicaDental.dto.OdontologoDTO;
import com.example.clinicaDental.services.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.apache.log4j.*;

@CrossOrigin
@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    Logger logger = Logger.getLogger(String.valueOf(OdontologoController.class));

    @GetMapping("/list")
    public ResponseEntity<?> getAll(){
        try {
            logger.info("Se esta por realizar una llamada al service para buscar los odontologos");
            return ResponseEntity.status(HttpStatus.OK).body(odontologoService.getAll());
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            logger.info("Se esta por realizar una llamada al service para buscar un odontologo");
            return ResponseEntity.status(HttpStatus.OK).body(odontologoService.findById(id));
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody OdontologoDTO odontologoDTO){
        try {
            logger.info("Se esta por realizar una llamada al service para guardar un odontologo");
            return ResponseEntity.status(HttpStatus.OK).body(odontologoService.save(odontologoDTO));
        }catch (Exception e){
            logger.error("No se pudo acceder al servicio");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody OdontologoDTO odontologoDTO){
        logger.info("Se esta por realizar una llamada al service para modificar el odontologo con id: " + id);
        odontologoService.update(id, odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        logger.info("Se esta por realizar una llamada al service para eliminar el odontologo con id: " + id);
        odontologoService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
