package br.com.java.springecommercebackendmaster.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.java.springecommercebackendmaster.common.ApiResponse;
import br.com.java.springecommercebackendmaster.model.Categoria;
import br.com.java.springecommercebackendmaster.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
 
    @Autowired
    private CategoriaService service;

    @GetMapping("/")
    public ResponseEntity<List<Categoria>> getProdutos() {
        List<Categoria> body = service.listaCategorias();

        return new ResponseEntity<List<Categoria>>(body, HttpStatus.OK);
    }

    @PostMapping("/criar")
    public ResponseEntity<ApiResponse> criarCategoria(@Valid @RequestBody Categoria categoria) {
        if (service.lerCategoria(categoria.getCategoriaNome()) !=null) {
            
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "categoria já existe"), HttpStatus.CONFLICT);
        }

        service.criarCategoria(categoria);

        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Categoria criada com sucesso!."), HttpStatus.CREATED);
    }

    @PostMapping("/ler")
    public ResponseEntity<Categoria> lerCategoria(@RequestBody long categoriaId) {

        Categoria categoria = service.lerCategoria(categoriaId);

        if (service != null)
          return new ResponseEntity<Categoria>(categoria, HttpStatus.OK);

          return new ResponseEntity<Categoria>(categoria, HttpStatus.NOT_FOUND);
    }
}
