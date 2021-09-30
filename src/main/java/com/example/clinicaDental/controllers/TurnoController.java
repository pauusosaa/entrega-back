package com.example.clinicaDental.controllers;


import com.example.clinicaDental.dto.PacienteDTO;
import com.example.clinicaDental.dto.TurnoDTO;
import com.example.clinicaDental.services.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody TurnoDTO turnoDTO){
        return ResponseEntity.status(HttpStatus.OK).body(turnoService.save(turnoDTO));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(turnoService.getAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        turnoService.delete(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
