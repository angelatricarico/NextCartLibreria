package it.nextre.nextcart.service;


import it.nextre.nextcart.dto.ProdottoDTO;

import java.util.List;
import java.util.Optional;

public interface ServizioProdotto {
    Optional<ProdottoDTO> trovaPerId(Long id);
    List<ProdottoDTO> trovaTutti();
    List<ProdottoDTO> trovaPerIdCategoria(Long idCategoria);

}