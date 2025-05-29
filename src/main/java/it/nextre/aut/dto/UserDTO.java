package it.nextre.aut.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe che rappresenta i dati di un utente.
 */
public class UserDTO {

    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private Set<RoleDTO> ruoli;

    /**
     * Costruttore di default.
     */
    public UserDTO() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param id       L'ID dell'utente.
     * @param nome     Il nome dell'utente.
     * @param cognome  Il cognome dell'utente.
     * @param email    L'email dell'utente.
     * @param password La password dell'utente.
     * @param ruoli    I ruoli associati all'utente.
     */
    public UserDTO(Long id, String nome, String cognome, String email, String password, Set<RoleDTO> ruoli) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.ruoli = ruoli;
    }

    /**
     * Metodo factory per creare un {@link UserDTOBuilder}.
     *
     * @return una nuova istanza di {@link UserDTOBuilder}.
     */
    public static UserDTOBuilder of() {
        return new UserDTOBuilder();
    }

    /**
     * Ottiene l'ID dell'utente.
     *
     * @return L'ID dell'utente.
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta l'ID dell'utente.
     *
     * @param id L'ID da impostare.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Ottiene il nome dell'utente.
     *
     * @return Il nome dell'utente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome dell'utente.
     *
     * @param nome Il nome da impostare.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Ottiene il cognome dell'utente.
     *
     * @return Il cognome dell'utente.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome dell'utente.
     *
     * @param cognome Il cognome da impostare.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Ottiene l'email dell'utente.
     *
     * @return L'email dell'utente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta l'email dell'utente.
     *
     * @param email L'email da impostare.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Ottiene la password dell'utente.
     *
     * @return La password dell'utente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta la password dell'utente.
     *
     * @param password La password da impostare.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Ottiene i ruoli dell'utente.
     *
     * @return I ruoli dell'utente.
     */
    public Set<RoleDTO> getRuoli() {
        return ruoli;
    }

    /**
     * Imposta i ruoli dell'utente.
     *
     * @param ruoli I ruoli da impostare.
     */
    public void setRuoli(Set<RoleDTO> ruoli) {
        this.ruoli = new HashSet<>(ruoli);
    }

    /**
     * Classe di supporto per la costruzione di oggetti {@link UserDTO}.
     */
    public static class UserDTOBuilder {

        private Long id;
        private String nome;
        private String cognome;
        private String email;
        private String password;
        private Set<RoleDTO> ruoli;

        /**
         * Imposta l'ID nel builder.
         *
         * @param id L'ID da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Imposta il nome nel builder.
         *
         * @param nome Il nome da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * Imposta il cognome nel builder.
         *
         * @param cognome Il cognome da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder cognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        /**
         * Imposta l'email nel builder.
         *
         * @param email L'email da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Imposta la password nel builder.
         *
         * @param password La password da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Imposta i ruoli nel builder.
         *
         * @param ruoli I ruoli da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public UserDTOBuilder ruoli(Set<RoleDTO> ruoli) {
            this.ruoli = new HashSet<>(ruoli);
            return this;
        }

        /**
         * Costruisce un'istanza di {@link UserDTO} con i valori impostati.
         *
         * @return Una nuova istanza di {@link UserDTO}.
         */
        public UserDTO build() {
            return new UserDTO(id, nome, cognome, email, password, ruoli);
        }
    }
}