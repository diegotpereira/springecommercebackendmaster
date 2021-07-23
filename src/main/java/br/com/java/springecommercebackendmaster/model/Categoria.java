package br.com.java.springecommercebackendmaster.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    private @Id@GeneratedValue long categoriaId;

    private @NotBlank String categoriaNome;

    private @NotBlank String descricao;

    public Categoria() {
    }

    public Categoria(@NotBlank String categoriaNome, @NotBlank String descricao) {
        this.categoriaNome = categoriaNome;
        this.descricao = descricao;
    }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + (int) (categoriaId ^ (categoriaId >>> 32));
    //     result = prime * result + ((categoriaNome == null) ? 0 : categoriaNome.hashCode());
    //     result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    //     return result;
    // }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Categoria other = (Categoria) obj;
        if (categoriaId != other.categoriaId)
            return false;
        if (categoriaNome == null) {
            if (other.categoriaNome != null)
                return false;
        } else if (!categoriaNome.equals(other.categoriaNome))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [categoriaId=" + categoriaId + ", categoriaNome=" + categoriaNome + ", descricao=" + descricao
                + "]";
    }
}
