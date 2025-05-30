package it.nextre.aut.service;

import it.nextre.aut.dto.RoleDTO;
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
     */
    void create(RoleDTO roleDTO);

    /**
     * Aggiorna un ruolo esistente.
     *
     * @param roleDTO Il ruolo da aggiornare.
     */
    void update(RoleDTO roleDTO);

    /**
     * Elimina un ruolo dal sistema.
     *
     * @param roleDTO Il ruolo da eliminare.
     */
    void delete(RoleDTO roleDTO);

    /**
     * Cerca un ruolo per ID.
     *
     * @param id L'ID del ruolo da cercare.
     * @return Un {@link Optional} contenente il ruolo, se trovato.
     */
    Optional<RoleDTO> findById(Long id);

    /**
     * Recupera la lista di tutti i ruoli presenti nel sistema.
     *
     * @return Una lista di {@link RoleDTO}.
     */
    List<RoleDTO> getAllRoles();

    /**
     * Recupera un elenco paginato di ruoli.
     *
     * @param page Numero della pagina da recuperare (indice base 0).
     * @param size Numero di elementi per pagina.
     * @return Un oggetto {@code PagedResult<RoleDTO>} contenente i ruoli e i meta-dati della paginazione.
     */
    PagedResult<RoleDTO> getAllRolesPag(int page, int size);
}