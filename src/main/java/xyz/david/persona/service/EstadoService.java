package xyz.david.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import xyz.david.persona.model.Estado;
import xyz.david.persona.repositoty.EstadoRepository;

@Service
public class EstadoService{

	@Autowired
	private EstadoRepository estadoRepository;

	public List<Estado> findAllByCountry(Long idPais) {
		List<Estado> estadosRespuesta = new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		for (int i = 0; i < estados.size(); i++) {
			if (estados.get(i).getPais().getId() == idPais) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		return estadosRespuesta;
	}

	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	public List<Estado> findAll(Sort sort) {
		return estadoRepository.findAll(sort);
	}

}
