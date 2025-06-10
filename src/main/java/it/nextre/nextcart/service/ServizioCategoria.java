package it.nextre.nextcart.service;


import it.nextre.nextcart.dto.CategoriaDTO;

import java.util.List;
import java.util.Optional;

public interface ServizioCategoria {

    CategoriaDTO salva(CategoriaDTO categoriaDTO);

    /**
     * Trova una categoria per il suo ID.
     *
     * @param id L'ID della categoria.
     * @return Un Optional contenente il DTO della categoria se trovata, altrimenti Optional.empty().
     */
    Optional<CategoriaDTO> trovaPerId(Long id);

    /**
     * Trova una categoria per il suo nome (case-insensitive).
     *
     * @param nome Il nome della categoria.
     * @return Un Optional contenente il DTO della categoria se trovata, altrimenti Optional.empty().
     */
    Optional<CategoriaDTO> trovaPerNome(String nome);

    /**
     * Recupera tutte le categorie.
     *
     * @return Una lista di tutti i DTO delle categorie.
     */
    List<CategoriaDTO> trovaTutte();

    CategoriaDTO modifica(CategoriaDTO categoriaDTO);


    void elimina(Long id) ;
}