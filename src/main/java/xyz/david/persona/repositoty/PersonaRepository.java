package xyz.david.persona.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import xyz.david.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
