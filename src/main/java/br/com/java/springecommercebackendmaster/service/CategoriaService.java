package br.com.java.springecommercebackendmaster.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.java.springecommercebackendmaster.model.Categoria;
import br.com.java.springecommercebackendmaster.repository.CategoriaRepository;

@Service
@Transactional
public class CategoriaService {
    
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listaCategorias() {
        return repository.findAll();
    }

    public void criarCategoria(Categoria categoria) {
        repository.save(categoria);
    }

    public Categoria lerCategoria(long categoriaId) {
        return repository.findByCategoriaId(categoriaId);
    }

    public Categoria lerCategoria(String categoriaNome) {
        return repository.findByCategoriaNome(categoriaNome);
    }
}
