package br.com.java.springecommercebackendmaster.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.java.springecommercebackendmaster.common.ApiResponse;
import br.com.java.springecommercebackendmaster.model.Usuario;
import br.com.java.springecommercebackendmaster.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService service;

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> dtos = service.listaUsuarios();

        return new ResponseEntity<List<Usuario>>(dtos, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> addPesquisa(@RequestBody @Valid Usuario usuario) {
        service.addUsuario(usuario);

        return new ResponseEntity<>(new ApiResponse(true, "Perfil criado com sucesso!."), HttpStatus.CREATED);
    }
}
