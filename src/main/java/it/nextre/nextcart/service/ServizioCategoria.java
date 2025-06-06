package it.nextre.nextcart.service;


import java.util.List;
import java.util.Optional;

import it.nextre.nextcart.dto.CategoriaDTO;

public interface ServizioCategoria {
	
	List<CategoriaDTO> getCategorie();
    Optional<CategoriaDTO> trovaPerId(Long id);


}
