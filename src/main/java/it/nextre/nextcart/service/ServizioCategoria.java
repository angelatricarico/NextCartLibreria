package it.nextre.nextcart.service;


import it.nextre.nextcart.dto.CategoriaDTO;

import java.util.List;
import java.util.Optional;

public interface ServizioCategoria {

    /**
     * Trova una categoria per il suo ID.
     *
     * @param id L'ID della categoria.
     * @return Un Optional contenente il DTO della categoria se trovata, altrimenti Optional.empty().
     */
    Optional<CategoriaDTO> trovaPerId(Long id);


    /**
     * Recupera tutte le categorie.
     *
     * @return Una lista di tutti i DTO delle categorie.
     */
    List<CategoriaDTO> trovaTutte();

}