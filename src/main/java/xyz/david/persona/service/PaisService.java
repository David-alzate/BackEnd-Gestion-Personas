package xyz.david.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.david.persona.model.Pais;
import xyz.david.persona.repositoty.PaisRepository;

@Service
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

}
