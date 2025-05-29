package it.nextre.aut.service;

import it.nextre.aut.dto.GroupDTO;

import java.util.List;
import java.util.Optional;

/**
 * Interfaccia per la gestione dei gruppi nel sistema.
 */
public interface GroupService {

    /**
     * Crea un nuovo gruppo.
     *
     * @param group Il gruppo da creare.
     */
    void create(GroupDTO group);

    /**
     * Aggiorna un gruppo esistente.
     *
     * @param group Il gruppo da aggiornare.
     */
    void update(GroupDTO group);

    /**
     * Elimina un gruppo dal sistema.
     *
     * @param group Il gruppo da eliminare.
     */
    void delete(GroupDTO group);

    /**
     * Cerca un gruppo per ID.
     *
     * @param id L'ID del gruppo da cercare.
     * @return Un {@link Optional} contenente il gruppo, se trovato.
     */
    Optional<GroupDTO> findById(Long id);

    /**
     * Recupera la lista di tutti i gruppi presenti nel sistema.
     *
     * @return Una lista di {@link GroupDTO}.
     */
    List<GroupDTO> getAllGroups();
}