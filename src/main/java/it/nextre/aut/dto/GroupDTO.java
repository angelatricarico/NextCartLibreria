package it.nextre.aut.dto;

/**
 * Classe che rappresenta un gruppo associato a un ruolo utente.
 */
public class GroupDTO {

    private Long id;
    private RoleDTO roleDTO;

    /**
     * Costruttore di default.
     */
    public GroupDTO() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param id      L'ID del gruppo.
     * @param roleDTO Il ruolo associato al gruppo.
     */
    public GroupDTO(Long id, RoleDTO roleDTO) {
        this.id = id;
        this.roleDTO = roleDTO;
    }

    /**
     * Metodo factory per creare un {@link GroupDTOBuilder}.
     *
     * @return una nuova istanza di {@link GroupDTOBuilder}.
     */
    public static GroupDTOBuilder of() {
        return new GroupDTOBuilder();
    }

    /**
     * Ottiene l'ID del gruppo.
     *
     * @return L'ID del gruppo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Imposta l'ID del gruppo.
     *
     * @param id L'ID da impostare.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Ottiene il ruolo associato al gruppo.
     *
     * @return Il ruolo del gruppo.
     */
    public RoleDTO getRoleDTO() {
        return roleDTO;
    }

    /**
     * Imposta il ruolo associato al gruppo.
     *
     * @param roleDTO Il ruolo da impostare.
     */
    public void setRoleDTO(RoleDTO roleDTO) {
        this.roleDTO = roleDTO;
    }

    /**
     * Classe di supporto per la costruzione di oggetti {@link GroupDTO}.
     */
    public static class GroupDTOBuilder {

        private Long id;
        private RoleDTO roleDTO;

        private GroupDTOBuilder() {
        }

        /**
         * Imposta l'ID nel builder.
         *
         * @param id L'ID da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public GroupDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Imposta il ruolo nel builder.
         *
         * @param roleDTO Il ruolo da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public GroupDTOBuilder roleDTO(RoleDTO roleDTO) {
            this.roleDTO = roleDTO;
            return this;
        }

        /**
         * Costruisce un'istanza di {@link GroupDTO} con i valori impostati.
         *
         * @return Una nuova istanza di {@link GroupDTO}.
         */
        public GroupDTO build() {
            return new GroupDTO(id, roleDTO);
        }
    }
}