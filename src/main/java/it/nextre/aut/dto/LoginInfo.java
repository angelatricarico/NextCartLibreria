package it.nextre.aut.dto;

/**
 * Classe che rappresenta le informazioni di login di un utente.
 */
public class LoginInfo {

    private String email;
    private String password;

    /**
     * Costruttore di default.
     */
    public LoginInfo() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param email    L'email dell'utente.
     * @param password La password dell'utente.
     */
    public LoginInfo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Metodo factory per creare un {@link LoginInfoBuilder}.
     *
     * @return un nuovo {@link LoginInfoBuilder}.
     */
    public static LoginInfoBuilder of() {
        return new LoginInfoBuilder();
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
     * Classe di supporto per la costruzione di oggetti {@link LoginInfo}.
     */
    public static class LoginInfoBuilder {

        private String email;
        private String password;

        private LoginInfoBuilder() {
        }

        /**
         * Imposta l'email nel builder.
         *
         * @param email L'email da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public LoginInfoBuilder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Imposta la password nel builder.
         *
         * @param password La password da impostare.
         * @return L'istanza aggiornata del builder.
         */
        public LoginInfoBuilder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Costruisce un'istanza di {@link LoginInfo} con i valori impostati.
         *
         * @return Una nuova istanza di {@link LoginInfo}.
         */
        public LoginInfo build() {
            return new LoginInfo(email, password);
        }
    }
}