package xyz.david.persona.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.david.persona.model.Persona;
import xyz.david.persona.repositoty.PersonaRepository;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    public <S extends Persona> S save(S entity) {
        return personaRepository.save(entity);
    }

    public Optional<Persona> findById(Long id) {
        return personaRepository.findById(id);
    }

    public void deleteById(Long id) {
        personaRepository.deleteById(id);
    }

    public void delete(Persona entity) {
        personaRepository.delete(entity);
    }

}
