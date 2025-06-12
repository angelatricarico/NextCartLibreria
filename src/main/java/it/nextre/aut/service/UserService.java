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
     */
    void register(UserDTO userDTO);
    
    
    /**
     * refresh del token JWT. (durata refresh token 1 giorno)
     * 
     * @param userDTO I dati dell'utente per il quale si desidera aggiornare il token. passato dal controller
     * @return Un token di autenticazione aggiornato.
     */ 
    TokenJwtDTO refreshToken(UserDTO userDTO);

    /**
     * Aggiorna i dati di un utente esistente.
     *
     * @param userDTO I dati aggiornati dell'utente.
     * @param user L'utente che sta effettuando l'aggiornamento (per controlli di autorizzazione).
     */
    void update(UserDTO userDTO,UserDTO user);

    /**
     * Elimina un utente dal sistema.
     *
     * @param userDTO L'utente da eliminare.
     * @param user L'utente che sta effettuando l'aggiornamento (per controlli di autorizzazione).
    
     */
    void delete(UserDTO userDTO,UserDTO user);


    TokenJwtDTO confirmRegistration(String tokenDTO);

}