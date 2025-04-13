package com.fernandoyutiz.mysql.dao;

import com.fernandoyutiz.mysql.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {
}
