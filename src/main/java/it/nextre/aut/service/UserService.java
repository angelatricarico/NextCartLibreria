package it.nextre.aut.service;

import it.nextre.aut.dto.LoginInfo;
import it.nextre.aut.dto.TokenJwtDTO;
import it.nextre.aut.dto.UserDTO;

/**
 * Interfaccia per la gestione degli utenti nel sistema.
 */
public interface UserService {

    /**
     * Effettua il login di un utente.
     *
     * @param loginInfo Le informazioni di login dell'utente.
     * @return Un token di autenticazione.
     */
    TokenJwtDTO login(LoginInfo loginInfo);

    /**
     * Registra un nuovo utente nel sistema.
     *
     * @param userDTO I dati dell'utente da registrare.
     * @return Un token di autenticazione.
     */
    TokenJwtDTO register(UserDTO userDTO);

    /**
     * Aggiorna i dati di un utente esistente.
     *
     * @param userDTO I dati aggiornati dell'utente.
     */
    void update(UserDTO userDTO);

    /**
     * Elimina un utente dal sistema.
     *
     * @param userDTO L'utente da eliminare.
     */
    void delete(UserDTO userDTO);
}