package it.nextre.aut.dto;

import java.util.HashSet;
import java.util.Set;

/**
 * La classe GroupDTO rappresenta un gruppo con un identificatore e un set di ruoli.
 */
public class GroupDTO extends DTO {
	private String descrizione;

    private Set<RoleDTO> roleDTO;

    /**
     * Costruttore di default.
     */
    public GroupDTO() {
    }

    /**
     * Costruttore con parametri.
     *
     * @param id      Identificatore univoco del gruppo.
     * @param roleDTO Set di ruoli associati al gruppo.
     * @param descrizione del ruolo.
     */
    public GroupDTO(Long id, Set<RoleDTO> roleDTO,String descrizione) {
        this.id = id;
        this.roleDTO = roleDTO;
        this.descrizione=descrizione;
    }

    /**
     * Metodo per ottenere un builder di GroupDTO.
     *
     * @return Istanza di GroupDTOBuilder.
     */
    public static GroupDTOBuilder of() {
        return new GroupDTOBuilder();
    }

    /**
     * Restituisce una copia del set di ruoli associati al gruppo.
     *
     * @return Set di ruoli del gruppo.
     */
    public Set<RoleDTO> getRoleDTO() {
        return new HashSet<>(roleDTO);
    }

    /**
     * Imposta il set di ruoli del gruppo.
     *
     * @param roleDTO Set di ruoli da associare al gruppo.
     */
    public void setRoleDTO(Set<RoleDTO> roleDTO) {
        this.roleDTO = new HashSet<>(roleDTO);
    }
    
    
    /**
     * restituisce la descrizione del ruolo
     * 
     * @return String contenente la descrizione
     */

    public String getDescrizione() {
		return descrizione;
	}

    
    /**
     * Imposta la descrizione del ruolo
     * 
     * @param descrizione da impostare
     */
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}




	/**
     * Classe builder per la costruzione di istanze di GroupDTO.
     */
    public static class GroupDTOBuilder {

        /**
         * Identificatore univoco del gruppo.
         */
        private Long id;

        /**
         * Set di ruoli associati al gruppo.
         */
        private Set<RoleDTO> roleDTO;
        private String descrizione;

        /**
         * Imposta l'identificatore del gruppo.
         *
         * @param id Identificatore univoco del gruppo.
         * @return Istanza corrente di GroupDTOBuilder.
         */
        public GroupDTOBuilder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * Imposta il set di ruoli associati al gruppo.
         *
         * @param roleDTO Set di ruoli da associare al gruppo.
         * @return Istanza corrente di GroupDTOBuilder.
         */
        public GroupDTOBuilder roleDTO(Set<RoleDTO> roleDTO) {
            this.roleDTO = roleDTO;
            return this;
        }
        public GroupDTOBuilder descrizione(String descrizione) {
        	this.descrizione= descrizione;
        	return this;
        }

        /**
         * Costruisce un'istanza di GroupDTO con i parametri impostati.
         *
         * @return Nuova istanza di GroupDTO.
         */
        public GroupDTO build() {
            return new GroupDTO(id, roleDTO,descrizione);
        }
    }
}