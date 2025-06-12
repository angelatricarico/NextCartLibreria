package it.nextre.aut.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * La classe UserDTO rappresenta un utente con vari attributi e appartenenza a un gruppo.
 */
public class UserDTO extends DTO {

    private String nome;
    private String cognome;
    private String email;
    private String password;
    private GroupDTO groupDTO;
    private Set<RoleDTO> ruoli;

    /**
     * Costruttore di default.
     */
    public UserDTO() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param id       Identificatore univoco dell'utente.
     * @param nome     Nome dell'utente.
     * @param cognome  Cognome dell'utente.
     * @param email    Indirizzo email dell'utente.
     * @param password Password dell'utente.
     * @param groupDTO Gruppo a cui l'utente appartiene.
     * @param ruoli    Set di ruoli associati all'utente.
     */
    public UserDTO(Long id,
                   String nome,
                   String cognome,
                   String email,
                   String password,
                   GroupDTO groupDTO,
                   Set<RoleDTO> ruoli) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.groupDTO = groupDTO;
        this.ruoli = new HashSet<>(ruoli);
    }

    /**
     * Metodo per ottenere un builder di UserDTO.
     *
     * @return Istanza di UserDTOBuilder.
     */
    public static UserDTOBuilder of() {
        return new UserDTOBuilder();
    }

    /**
     * Restituisce il nome dell'utente.
     *
     * @return Nome dell'utente.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome dell'utente.
     *
     * @param nome Nome dell'utente.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome dell'utente.
     *
     * @return Cognome dell'utente.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome dell'utente.
     *
     * @param cognome Cognome dell'utente.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce l'indirizzo email dell'utente.
     *
     * @return Indirizzo email dell'utente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta l'indirizzo email dell'utente.
     *
     * @param email Indirizzo email dell'utente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Restituisce la password dell'utente.
     *
     * @return Password dell'utente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta la password dell'utente.
     *
     * @param password Password dell'utente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce i ruoli dell'utente.
     *
     * @return Set di ruoli dell'utente.
     */
    public Set<RoleDTO> getRuoli() {
        return new HashSet<>(ruoli);
    }

    /**
     * Imposta i ruoli dell'utente.
     *
     * @param ruoli Set di ruoli da associare all'utente.
     */
    public void setRuoli(Set<RoleDTO> ruoli) {
        this.ruoli = new HashSet<>(ruoli);
    }

    /**
     * Restituisce il gruppo associato all'utente.
     *
     * @return Gruppo dell'utente.
     */
    public GroupDTO getGroupDTO() {
        return groupDTO;
    }

    /**
     * Imposta il gruppo associato all'utente.
     *
     * @param groupDTO Gruppo da associare all'utente.
     */
    public void setGroupDTO(GroupDTO groupDTO) {
        this.groupDTO = groupDTO;
    }

    /**
     * Classe builder per la costruzione di istanze di UserDTO.
     */
    public static class UserDTOBuilder {

        private Long id;
        private String nome;
        private String cognome;
        private String email;
        private String password;
        private GroupDTO groupDTO;
        private Set<RoleDTO> ruoli;

        /**
         * Imposta l'identificatore dell'utente.
         *
         * @param id Identificatore univoco dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Imposta il nome dell'utente.
         *
         * @param nome Nome dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * Imposta il cognome dell'utente.
         *
         * @param cognome Cognome dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder cognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        /**
         * Imposta l'indirizzo email dell'utente.
         *
         * @param email Indirizzo email dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Imposta la password dell'utente.
         *
         * @param password Password dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Imposta il gruppo dell'utente.
         *
         * @param groupDTO Gruppo dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder groupDTO(GroupDTO groupDTO) {
            this.groupDTO = groupDTO;
            return this;
        }

        /**
         * Imposta i ruoli dell'utente.
         *
         * @param ruoli Set di ruoli dell'utente.
         * @return Istanza corrente di UserDTOBuilder.
         */
        public UserDTOBuilder ruoli(Set<RoleDTO> ruoli) {
            this.ruoli = ruoli;
            return this;
        }

        /**
         * Costruisce un'istanza di UserDTO con i parametri impostati.
         *
         * @return Nuova istanza di UserDTO.
         */
        public UserDTO build() {
            return new UserDTO(id, nome, cognome, email, password, groupDTO, ruoli);
        }
    }
}