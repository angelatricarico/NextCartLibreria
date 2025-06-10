package it.nextre.nextcart.service;


import it.nextre.nextcart.dto.ProdottoDTO;

import java.util.List;
import java.util.Optional;

public interface ServizioProdotto {
    ProdottoDTO salva(ProdottoDTO prodottoDTO) ;
    Optional<ProdottoDTO> trovaPerId(Long id);
    List<ProdottoDTO> trovaTutti();
    List<ProdottoDTO> trovaPerIdCategoria(Long idCategoria);
    ProdottoDTO modifica(ProdottoDTO prodottoDTO) ;
    void elimina(Long id) ;
}