package it.nextre.nextcart.dto;

import java.math.BigDecimal;

public class ProdottoDTO {
    private Long id;
    private String nome;
    private BigDecimal quantita;
    private String percorsoImmagine;
    private CategoriaDTO categoriaDTO; 

    public ProdottoDTO(Long id, String nome, BigDecimal quantita, String percorsoImmagine, CategoriaDTO categoriaDTO) {
        this.id = id;
        this.nome = nome;
        this.quantita = quantita;
        this.percorsoImmagine = percorsoImmagine;
        this.categoriaDTO = categoriaDTO;
    }
    
    public ProdottoDTO() {
    	
    	
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

	public CategoriaDTO getCategoriaDTO() {
		return categoriaDTO;
	}

	public void setCategoriaDTO(CategoriaDTO categoriaDTO) {
		this.categoriaDTO = categoriaDTO;
	}
    


}
