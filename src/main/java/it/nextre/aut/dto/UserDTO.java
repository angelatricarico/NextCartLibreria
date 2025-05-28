package it.nextre.aut.dto;

import java.util.HashSet;
import java.util.Set;

public class UserDTO {

    private Long id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private Set<RoleDTO> ruoli;

    public UserDTO() {
    }

    public UserDTO(Long id,
                   String nome,
                   String cognome,
                   String email,
                   String password,
                   Set<RoleDTO> ruoli) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.ruoli = ruoli;
    }

    public static UserDTOBuilder of() {
        return new UserDTOBuilder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDTO> getRuoli() {
        return ruoli;
    }

    public void setRuoli(Set<RoleDTO> ruoli) {
        this.ruoli = new HashSet<>(ruoli);
    }

    public static class UserDTOBuilder {

        private Long id;
        private String nome;
        private String cognome;
        private String email;
        private String password;
        private Set<RoleDTO> ruoli;

        public UserDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserDTOBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public UserDTOBuilder cognome(String cognome) {
            this.cognome = cognome;
            return this;
        }

        public UserDTOBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserDTOBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserDTOBuilder ruoli(Set<RoleDTO> ruoli) {
            this.ruoli = new HashSet<>(ruoli);
            return this;
        }

        public UserDTO build() {
            return new UserDTO(id, nome, cognome, email, password, ruoli);
        }
    }
}
