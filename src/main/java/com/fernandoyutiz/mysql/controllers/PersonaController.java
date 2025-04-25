package com.fernandoyutiz.mysql.controllers;

import com.fernandoyutiz.mysql.model.Persona;
import com.fernandoyutiz.mysql.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/guardapersona")
    public ResponseEntity<Persona> guardaPersona(@RequestBody Persona persona){
        return new ResponseEntity<>(personaService.guardarPersona(persona), HttpStatus.CREATED);
    }

    @GetMapping("/listarpersonas")
    public ResponseEntity<List<Persona>> listarPersonas(){
        return new ResponseEntity<>(personaService.listarPeronas(),HttpStatus.ACCEPTED);
    }
}
