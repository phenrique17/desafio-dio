package com.example.desafiodio.controller;

import com.example.desafiodio.model.Pessoa;
import com.example.desafiodio.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Paulo Santos
 */
@RestController
@RequestMapping("pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<Iterable<Pessoa>> getAll() {
        return ResponseEntity.ok(pessoaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> getById(@PathVariable Long id) {
        return ResponseEntity.ok(pessoaService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        pessoaService.save(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @PutMapping
    public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {
        pessoaService.update(pessoa);
        return ResponseEntity.ok(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        pessoaService.delete(id);
        return ResponseEntity.ok().build();
    }


}
