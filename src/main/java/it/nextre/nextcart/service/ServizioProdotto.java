package it.nextre.nextcart.service;

import it.nextre.nextcart.dto.ProdottoDTO;
import it.nextre.nextcart.exception.EccezioneRisorsaNonTrovata;

import java.util.List;
import java.util.Optional;

public interface ServizioProdotto {
    ProdottoDTO salva(ProdottoDTO prodottoDTO) throws EccezioneRisorsaNonTrovata;
    Optional<ProdottoDTO> trovaPerId(Long id);
    List<ProdottoDTO> trovaTutti();
    List<ProdottoDTO> trovaPerIdCategoria(Long idCategoria);
    ProdottoDTO modifica(ProdottoDTO prodottoDTO) throws EccezioneRisorsaNonTrovata;
    void elimina(Long id) throws EccezioneRisorsaNonTrovata;
}