package it.nextre.aut.dto;

import java.time.Instant;

public abstract class DTO {
	protected Long id; 
	protected Instant ultimaModifica;
    protected Instant dataCreazione;
    protected Long creationUser;
    
    
   public DTO() {
	}
	

	
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Instant getUltimaModifica() {
		return ultimaModifica;
	}
	public void setUltimaModifica(Instant ultimaModifica) {
		this.ultimaModifica = ultimaModifica;
	}
	public Instant getDataCreazione() {
		return dataCreazione;
	}
	public void setDataCreazione(Instant dataCreazione) {
		this.dataCreazione = dataCreazione;
	}
	public Long getCreationUser() {
		return creationUser;
	}
	public void setCreationUser(Long creationUser) {
		this.creationUser = creationUser;
	}
    
    


}
