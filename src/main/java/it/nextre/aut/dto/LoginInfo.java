package it.nextre.aut.dto;

public class LoginInfo {

    private String email;
    private String password;

    public LoginInfo() {
    }

    public LoginInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static LoginInfoBuilder of() {
        return new LoginInfoBuilder();
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

    public static class LoginInfoBuilder {

        private String email;
        private String password;

        private LoginInfoBuilder(){}

        public LoginInfoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public LoginInfoBuilder password(String password) {
            this.password = password;
            return this;
        }

        public LoginInfo build() {
            return new LoginInfo(email, password);
        }
    }

}
