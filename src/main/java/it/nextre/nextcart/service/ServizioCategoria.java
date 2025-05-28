package it.nextre.nextcart.service;

import java.util.List;
import java.util.Optional;

import it.nextre.nextcart.dto.CategoriaDTO;

public interface ServizioCategoria {
	
    Optional<CategoriaDTO> trovaPerId(Long id);
    Optional<CategoriaDTO> trovaPerNome(String nome);
    List<CategoriaDTO> trovaTutte();

}
