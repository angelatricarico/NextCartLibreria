package it.nextre.aut.service;

import it.nextre.aut.dto.UserDTO;

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
     */
    void createUser(UserDTO userDTO);

    /**
     * Recupera la lista di tutti gli utenti presenti nel sistema.
     *
     * @return Una lista di {@link UserDTO}.
     */
    List<UserDTO> getAllUsers();

    /**
     * Cerca un utente per ID.
     *
     * @param id L'ID dell'utente da cercare.
     * @return Un {@link Optional} contenente l'utente, se trovato.
     */
    Optional<UserDTO> findById(Long id);
}