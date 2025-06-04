package it.nextre.aut.dto;

/**
 * Classe DTO per rappresentare un token JWT, contenente access token e refresh token.
 */
public class TokenJwtDTO {

    private String accessToken;
    private String refreshToken;

    /**
     * Costruttore vuoto per la classe TokenJwtDTO.
     */
    public TokenJwtDTO() {
    }

    /**
     * Costruttore con parametri per inizializzare access token e refresh token.
     *
     * @param accessToken  il token di accesso
     * @param refreshToken il token di aggiornamento
     */
    public TokenJwtDTO(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    /**
     * Metodo statico per ottenere un builder della classe TokenJwtDTO.
     *
     * @return un'istanza di TokenJwtDTOBuilder
     */
    public static TokenJwtDTOBuilder of() {
        return new TokenJwtDTOBuilder();
    }

    /**
     * Restituisce l'access token.
     *
     * @return il token di accesso
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Imposta un nuovo access token.
     *
     * @param accessToken il nuovo token di accesso
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Restituisce il refresh token.
     *
     * @return il token di aggiornamento
     */
    public String getRefreshToken() {
        return refreshToken;
    }

    /**
     * Imposta un nuovo refresh token.
     *
     * @param refreshToken il nuovo token di aggiornamento
     */
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * Classe builder per creare istanze di TokenJwtDTO in modo fluido.
     */
    public static class TokenJwtDTOBuilder {

        private String accessToken;
        private String refreshToken;

        /**
         * Imposta l'access token nel builder.
         *
         * @param accessToken il token di accesso
         * @return l'istanza corrente di TokenJwtDTOBuilder
         */
        public TokenJwtDTOBuilder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Imposta il refresh token nel builder.
         *
         * @param refreshToken il token di aggiornamento
         * @return l'istanza corrente di TokenJwtDTOBuilder
         */
        public TokenJwtDTOBuilder refreshToken(String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }

        /**
         * Crea un'istanza di TokenJwtDTO con i valori impostati nel builder.
         *
         * @return una nuova istanza di TokenJwtDTO
         */
        public TokenJwtDTO build() {
            return new TokenJwtDTO(accessToken, refreshToken);
        }
    }
}