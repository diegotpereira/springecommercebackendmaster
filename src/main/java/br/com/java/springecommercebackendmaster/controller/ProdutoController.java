package br.com.java.springecommercebackendmaster.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import br.com.java.springecommercebackendmaster.common.ApiResponse;
import br.com.java.springecommercebackendmaster.model.Produto;
import br.com.java.springecommercebackendmaster.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    
    @Autowired
    ProdutoService service;

    @GetMapping("/")
    public ResponseEntity<List<Produto>> getProdutos() {
        List<Produto> body = service.listaProdutos();

        return new ResponseEntity<List<Produto>>(body, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addProduto(@RequestBody @Valid Produto produto) {
        service.addProduto(produto);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Produto adicionado com sucesso!."), HttpStatus.CREATED);
    }

    @PutMapping("/atualizar/{produtoID}")
    public ResponseEntity<ApiResponse> atualizaProduto (@PathVariable("produtoID") long produtoID, @RequestBody @Valid Produto produto) {
        service.atualizarProduto(produtoID, produto);

        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Produto atualizado com sucesso!"), HttpStatus.OK);
    }
}
