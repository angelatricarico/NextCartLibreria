package it.nextre.aut.service;

import it.nextre.aut.dto.GroupDTO;
import it.nextre.aut.dto.UserDTO;
import it.nextre.aut.pagination.PagedResult;

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
     * @param user L'utente che sta creando il gruppo.
     */
    void create(GroupDTO group,UserDTO user);

    /**
     * Aggiorna un gruppo esistente.
     *
     * @param group Il gruppo da aggiornare.
     * @param user L'utente che sta aggiornando il gruppo.
     */
    void update(GroupDTO group,UserDTO user);

    /**
     * Elimina un gruppo dal sistema.
     *
     * @param group Il gruppo da eliminare.
     * @param user L'utente che sta eliminando il gruppo.
     */
    void delete(GroupDTO group,UserDTO user);

    /**
     * Cerca un gruppo per ID.
     *
     * @param id L'ID del gruppo da cercare.
     * @param user L'utente che sta cercando il gruppo.
     * @return Un {@link Optional} contenente il gruppo, se trovato.
     */
    Optional<GroupDTO> findById(Long id,UserDTO user);

    /**
     * Recupera la lista di tutti i gruppi presenti nel sistema.
     * @param user L'utente che sta richiedendo la lista dei gruppi.
     *
     * @return Una lista di {@link GroupDTO}.
     */
    List<GroupDTO> getAllGroups(UserDTO user);

    /**
     * Recupera un elenco paginato di gruppi.
     *
     * @param page Numero della pagina da recuperare (indice base 0).
     * @param size Numero di elementi per pagina.
     * @param user L'utente che sta richiedendo la lista dei gruppi.
     * @return Un oggetto {@code PagedResult<GroupDTO>} contenente i gruppi e i meta-dati della paginazione.
     */
    PagedResult<GroupDTO> getAllGroupsPag(int page, int size,UserDTO user);
}