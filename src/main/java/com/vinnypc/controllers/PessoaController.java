package com.vinnypc.controllers;

import com.vinnypc.model.Pessoa;
import com.vinnypc.repository.PessoaRepository;
import com.vinnypc.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/all")
    public ResponseEntity<List<Pessoa>> getAll(){
        return ResponseEntity.ok(pessoaRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> findById(@PathVariable Integer id){
        var pessoa = pessoaService.findById(id);
        return ResponseEntity.ok(pessoa);
    }

    @PostMapping
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa pessoa){
        var pessoaCadastrada = pessoaService.create(pessoa);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pessoaCadastrada.getPes_id())
                .toUri();
        return ResponseEntity.created(location).body(pessoaCadastrada);
    }


}
