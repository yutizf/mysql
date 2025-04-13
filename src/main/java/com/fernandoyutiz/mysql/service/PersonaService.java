package com.fernandoyutiz.mysql.service;

import com.fernandoyutiz.mysql.dao.PersonaDAO;
import com.fernandoyutiz.mysql.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaDAO personaDAO;

    public PersonaService(PersonaDAO personaDAO) {
        this.personaDAO = personaDAO;
    }

    public Persona guardarPersona(Persona persona){
        return personaDAO.save(persona);
    }

    public List<Persona> listarPeronas(){
        return personaDAO.findAll();
    }
}
