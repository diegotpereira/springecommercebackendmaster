package br.com.java.springecommercebackendmaster.model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    private long id;

    private String usuarionome;

    private String email;

    private String nome;

    private String sobrenome;

    public Usuario() {
    }

    public Usuario(long id, String usuarionome, String email, String nome, String sobrenome) {
        this.id = id;
        this.usuarionome = usuarionome;
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuarionome() {
        return usuarionome;
    }

    public void setUsuarionome(String usuarionome) {
        this.usuarionome = usuarionome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        result = prime * result + ((usuarionome == null) ? 0 : usuarionome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (id != other.id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sobrenome == null) {
            if (other.sobrenome != null)
                return false;
        } else if (!sobrenome.equals(other.sobrenome))
            return false;
        if (usuarionome == null) {
            if (other.usuarionome != null)
                return false;
        } else if (!usuarionome.equals(other.usuarionome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PerfilUsuario [email=" + email + ", id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome
                + ", usuarionome=" + usuarionome + "]";
    }
}
