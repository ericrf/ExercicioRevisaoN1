package mobile.fae.edu.exerciciorevisaon1.model;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

/**
 * Created by Eric on 07/04/2015.
 */
public class Receita implements Serializable {

    private Long idReceita;
    private String nome;
    private String ingredientes;
    private String modoPreparo;
    private String foto;
    private String observacao;

    public Receita(Long idReceita, String nome, String ingredientes, String modoPreparo,
                   String foto, String observacao){
        this.idReceita = idReceita;
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.foto = foto;
        this.observacao = observacao;
    }

    public Receita(Long idReceita, String nome, String ingredientes, String modoPreparo,
                   String foto){
        this(idReceita, nome, ingredientes, modoPreparo, foto, null);
    }

    public Receita(){}

    public Long getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(Long idReceita) {
        this.idReceita = idReceita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
