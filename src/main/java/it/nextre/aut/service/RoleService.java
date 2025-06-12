package it.nextre.aut.service;

import it.nextre.aut.dto.RoleDTO;
import it.nextre.aut.dto.UserDTO;
import it.nextre.aut.pagination.PagedResult;

import java.util.List;
import java.util.Optional;

/**
 * Interfaccia per la gestione dei ruoli nel sistema.
 */
public interface RoleService {

    /**
     * Crea un nuovo ruolo.
     *
     * @param roleDTO Il ruolo da creare.
     * @param user L'utente che sta creando il ruolo.
     */
    void create(RoleDTO roleDTO,UserDTO user);

    /**
     * Aggiorna un ruolo esistente.
     *
     * @param roleDTO Il ruolo da aggiornare.
     * @param user L'utente che sta aggiornando il ruolo.
     */
    void update(RoleDTO roleDTO,UserDTO user);

    /**
     * Elimina un ruolo dal sistema.
     *
     * @param roleDTO Il ruolo da eliminare.
     * @param user L'utente che sta eliminando il ruolo.
     */
    void delete(RoleDTO roleDTO,UserDTO user);

    /**
     * Cerca un ruolo per ID.
     *
     * @param id L'ID del ruolo da cercare.
     * @param user L'utente che sta cercando il ruolo.
     * @return Un {@link Optional} contenente il ruolo, se trovato.
     */
    Optional<RoleDTO> findById(Long id,UserDTO user);

    /**
     * Recupera la lista di tutti i ruoli presenti nel sistema.
     * @param user L'utente che sta richiedendo la lista dei ruoli.
     * @return Una lista di {@link RoleDTO}.
     */
    List<RoleDTO> getAllRoles(UserDTO user);

    /**
     * Recupera un elenco paginato di ruoli.
     *
     * @param page Numero della pagina da recuperare (indice base 0).
     * @param size Numero di elementi per pagina.
     * @param user L'utente che sta richiedendo la lista dei ruoli.
     * @return Un oggetto {@code PagedResult<RoleDTO>} contenente i ruoli e i meta-dati della paginazione.
     */
    PagedResult<RoleDTO> getAllRolesPag(int page, int size,UserDTO user);
}