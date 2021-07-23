package br.com.java.springecommercebackendmaster.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "produtos")
public class Produto {

    private @GeneratedValue @Id long id;

    private @NotNull String nome;

    private @NotNull String descricao;

    private @NotNull double preco;

    private @NotNull String imageURL;

    public Produto() {
    }

    public Produto(long id, @NotNull String nome, @NotNull String descricao, @NotNull double preco,
            @NotNull String imageURL) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imageURL = imageURL;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", id=" + id + ", imageURL=" + imageURL + ", nome=" + nome
                + ", preco=" + preco + "]";
    }
}
