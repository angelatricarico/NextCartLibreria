package it.nextre.aut.service;

import it.nextre.aut.dto.UserDTO;
import it.nextre.aut.pagination.PagedResult;

import java.util.List;
import java.util.Optional;

/**
 * Interfaccia per la gestione amministrativa degli utenti nel sistema.
 * Estende {@link UserService} aggiungendo funzionalità di amministrazione.
 */
public interface UserAdminService extends UserService {

    /**
     * Crea un nuovo utente con privilegi amministrativi.
     *
     * @param userDTO I dati dell'utente da creare.
     * @param user L'utente che sta creando il nuovo utente.
     */
    void createUser(UserDTO userDTO,UserDTO user);

    /**
     * Recupera la lista di tutti gli utenti presenti nel sistema.
     *
     * @param user L'utente che sta richiedendo la lista degli utenti.
     * @return Una lista di {@link UserDTO}.
     */
    List<UserDTO> getAllUsers(UserDTO user);

    /**
     * Cerca un utente per ID.
     *
     * @param id L'ID dell'utente da cercare.
     * @param user L'utente che sta cercando l'utente specificato.
     * @return Un {@link Optional} contenente l'utente, se trovato.
     */
    Optional<UserDTO> findById(Long id,UserDTO user);

    /**
     * Recupera un elenco paginato di utenti.
     *
     * @param page Numero della pagina da recuperare (indice base 0).
     * @param size Numero di elementi per pagina.
     * @param user L'utente che sta richiedendo la lista degli utenti.
     * @return Un oggetto {@code PagedResult<UserDTO>} contenente gli utenti e i meta-dati della paginazione.
     */
    PagedResult<UserDTO> getAllUsersPag(int page, int size,UserDTO user);
}