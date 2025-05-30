package it.nextre.aut.pagination;

import java.util.List;

/**
 * Classe generica per la gestione di paginazione dei risultati.
 *
 * @param <T> Tipo degli elementi contenuti nella pagina.
 */
public class PagedResult<T> {

    private List<T> content;
    private int totalElements;
    private int totalPages;
    private int pageSize;

    /**
     * Costruttore di default.
     */
    public PagedResult() {
    }

    /**
     * Costruttore con parametri per inizializzare i dati di paginazione.
     *
     * @param content       Lista degli elementi presenti nella pagina.
     * @param totalElements Numero totale di elementi nella collezione.
     * @param pageSize      Dimensione della pagina.
     */
    public PagedResult(List<T> content, int totalElements, int pageSize) {
        this.content = content;
        this.totalElements = totalElements;
        this.totalPages = totalElements / pageSize;
        this.pageSize = pageSize;
    }

    /**
     * Crea una nuova istanza di {@code PagedResult} basata su un'altra.
     *
     * @param old Istanza esistente da cui copiare i dati.
     * @return Nuova istanza di {@code PagedResult} con gli stessi meta-dati.
     */
    public static <T, K> PagedResult<K> copy(PagedResult<T> old) {
        var res = new PagedResult<K>();
        res.setPageSize(old.pageSize);
        res.setTotalElements(old.totalElements);
        res.setTotalPages(old.totalPages);
        return res;
    }

    /**
     * Restituisce la lista degli elementi contenuti nella pagina.
     *
     * @return Lista di elementi.
     */
    public List<T> getContent() {
        return content;
    }

    /**
     * Imposta la lista degli elementi contenuti nella pagina.
     *
     * @param content Lista di elementi.
     */
    public void setContent(List<T> content) {
        this.content = content;
    }

    /**
     * Restituisce il numero totale di elementi nella collezione.
     *
     * @return Numero totale di elementi.
     */
    public int getTotalElements() {
        return totalElements;
    }

    /**
     * Imposta il numero totale di elementi nella collezione.
     *
     * @param totalElements Numero totale di elementi.
     */
    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    /**
     * Restituisce il numero totale di pagine calcolate.
     *
     * @return Numero totale di pagine.
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Imposta il numero totale di pagine.
     *
     * @param totalPages Numero totale di pagine.
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Restituisce la dimensione della pagina.
     *
     * @return Dimensione della pagina.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Imposta la dimensione della pagina.
     *
     * @param pageSize Dimensione della pagina.
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("content : ");
        for (T elem : content) sb.append("\n ").append(elem);
        sb.append("\n pagSize : ").append(pageSize);
        sb.append("\n totalPag : ").append(totalPages);
        sb.append("\n totalElement : ").append(totalElements);
        return sb.toString();
    }
}
