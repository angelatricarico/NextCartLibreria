package it.nextre.nextcart.service;

import java.util.List;
import java.util.Optional;

import it.nextre.nextcart.dto.ProdottoDTO;


public interface ServizioProdotto {

    Optional<ProdottoDTO> trovaPerId(Long id);
    List<ProdottoDTO> trovaPerIdCategoria(Long idCategoria);
}
