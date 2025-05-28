package it.nextre.aut.dto;

import java.util.Objects;

public class RoleDTO {

    private Long id;
    private Long priority;
    private Boolean admin;
    private String descrizione;

    public RoleDTO() {
    }

    public RoleDTO(Long id,
                   Long priority,
                   Boolean admin,
                   String descrizione) {
        this.id = id;
        this.priority = priority;
        this.admin = admin;
        this.descrizione = descrizione;
    }

    public static RoleDTOBuilder of() {
        return new RoleDTOBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getDescrizione() {
        return descrizione;
    }

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

    public static class RoleDTOBuilder {

        private Long id;
        private Long priority;
        private Boolean admin;
        private String descrizione;

        private RoleDTOBuilder() {
        }

        public RoleDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public RoleDTOBuilder priority(Long priority) {
            this.priority = priority;
            return this;
        }

        public RoleDTOBuilder admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        public RoleDTOBuilder descrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        public RoleDTO build() {
            return new RoleDTO(id, priority, admin, descrizione);
        }
    }
}
