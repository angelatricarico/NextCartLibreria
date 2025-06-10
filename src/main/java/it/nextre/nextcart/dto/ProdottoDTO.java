package it.nextre.nextcart.dto;


import java.math.BigDecimal;


public class ProdottoDTO {
	
	private Long id;
	private String nome;
	private BigDecimal quantita;
	private String percorsoImmagine;
	private String tipologia;
	private CategoriaDTO categoriaDTO;

	public ProdottoDTO() {
	}

	public ProdottoDTO(Long id, String nome, BigDecimal quantita, String percorsoImmagine, CategoriaDTO categoriaDTO, String tipologia) {
		this.id = id;
		this.nome = nome;
		this.quantita = quantita;
		this.categoriaDTO = categoriaDTO;
		this.tipologia = tipologia;
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

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public CategoriaDTO getCategoriaDTO() {
		return categoriaDTO;
	}

	public void setCategoriaDTO(CategoriaDTO categoriaDTO) {
		this.categoriaDTO = categoriaDTO;
	}

	

}
