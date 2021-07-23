package br.com.java.springecommercebackendmaster.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.springecommercebackendmaster.model.Produto;
import br.com.java.springecommercebackendmaster.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository  repository;

    public void addProduto(Produto produto) {
        repository.save(produto);
    }

    public void atualizarProduto(long produtoID, Produto novoProduto) {
        Produto antigoProduto = repository.findById(produtoID).get();
        antigoProduto.setNome(novoProduto.getNome());
        antigoProduto.setDescricao(novoProduto.getDescricao());
        antigoProduto.setPreco(novoProduto.getPreco());
        antigoProduto.setImageURL(novoProduto.getImageURL());

        repository.save(antigoProduto);
    }

    public List<Produto> listaProdutos() {
        return repository.findAll();
    }
}
