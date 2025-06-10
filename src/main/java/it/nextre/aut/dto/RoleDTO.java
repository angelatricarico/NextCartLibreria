package it.nextre.aut.dto;

import java.util.Objects;

/**
 * Classe che rappresenta un ruolo utente nel sistema.
 */
public class RoleDTO extends DTO{

    private Long priority;
    private Boolean admin;
    private String descrizione;

    /**
     * Costruttore di default.
     */
    public RoleDTO() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param id          L'ID del ruolo.
     * @param priority    La priorità del ruolo.
     * @param admin       Indica se il ruolo ha privilegi di amministratore.
     * @param descrizione La descrizione del ruolo.
     */
    public RoleDTO(Long id, Long priority, Boolean admin, String descrizione) {
        this.id = id;
        this.priority = priority;
        this.admin = admin;
        this.descrizione = descrizione;
    }

    /**
     * Metodo factory per creare un {@link RoleDTOBuilder}.
     *
     * @return una nuova istanza di {@link RoleDTOBuilder}.
     */
    public static RoleDTOBuilder of() {
        return new RoleDTOBuilder();
    }

    /**
     * Ottiene l'ID del ruolo.
     *
     * @return L'ID del ruolo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta l'ID del ruolo.
     *
     * @param id L'ID da impostare.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Ottiene la priorità del ruolo.
     *
     * @return La priorità del ruolo.
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Imposta la priorità del ruolo.
     *
     * @param priority La priorità da impostare.
     */
    public void setPriority(Long priority) {
        this.priority = priority;
    }

    /**
     * Verifica se il ruolo ha privilegi di amministratore.
     *
     * @return `true` se il ruolo è amministratore, `false` altrimenti.
     */
    public Boolean getAdmin() {
        return admin;
    }

    /**
     * Imposta il ruolo come amministratore o meno.
     *
     * @param admin `true` se il ruolo deve essere amministratore, `false` altrimenti.
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * Ottiene la descrizione del ruolo.
     *
     * @return La descrizione del ruolo.
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * Imposta la descrizione del ruolo.
     *
     * @param descrizione La descrizione da impostare.
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RoleDTO roleDTO)) return false;

        return Objects.equals(id, roleDTO.id) && Objects.equals(priority, roleDTO.priority) && Objects.equals(admin, roleDTO.admin) && Objects.equals(descrizione, roleDTO.descrizione);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(priority);
        result = 31 * result + Objects.hashCode(admin);
        result = 31 * result + Objects.hashCode(descrizione);
        return result;
    }

    /**
     * Classe di supporto per la costruzione di oggetti {@link RoleDTO}.
     */
    public static class RoleDTOBuilder {

        private Long id;
        private Long priority;
        private Boolean admin;
        private String descrizione;

        private RoleDTOBuilder() {
        }

        /**
         * Imposta l'ID nel builder.
         *
         * @param id L'ID da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public RoleDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Imposta la priorità nel builder.
         *
         * @param priority La priorità da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public RoleDTOBuilder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Imposta il ruolo come amministratore nel builder.
         *
         * @param admin `true` se il ruolo deve essere amministratore, `false` altrimenti.
         * @return L'istanza aggiornata del builder.
         */
        public RoleDTOBuilder admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        /**
         * Imposta la descrizione nel builder.
         *
         * @param descrizione La descrizione da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public RoleDTOBuilder descrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * Costruisce un'istanza di {@link RoleDTO} con i valori impostati.
         *
         * @return Una nuova istanza di {@link RoleDTO}.
         */
        public RoleDTO build() {
            return new RoleDTO(id, priority, admin, descrizione);
        }
    }
}