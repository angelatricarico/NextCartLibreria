package it.nextre.nextcart.dto;


import java.math.BigDecimal;


public class ProdottoDTO {
	private Long id;

	private String nome;

	private String descrizione;

	private BigDecimal quantita;

	private String percorsoImmagine;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public ProdottoDTO() {
	}

	public ProdottoDTO(Long id, String nome, String descrizione, BigDecimal quantita, String percorsoImmagine, Long categoriaId, String categoriaNome, String tipologia) {
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.quantita = quantita;
		this.percorsoImmagine = percorsoImmagine;
		this.categoriaId = categoriaId;
		this.categoriaNome = categoriaNome;
		this.tipologia = tipologia;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public BigDecimal getQuantita() {
		return quantita;
	}

	public void setQuantita(BigDecimal quantita) {
		this.quantita = quantita;
	}

	public String getPercorsoImmagine() {
		return percorsoImmagine;
	}

	public void setPercorsoImmagine(String percorsoImmagine) {
		this.percorsoImmagine = percorsoImmagine;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
	}

	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}


	private Long categoriaId;
	private String categoriaNome;

	private String tipologia;
}
