package br.com.java.springecommercebackendmaster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java.springecommercebackendmaster.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
    public Categoria findByCategoriaId(long categoriaId);

    public Categoria findByCategoriaNome(String categoriaNome);
}
