package com.example.desafiodio.service.impl;

import com.example.desafiodio.model.Pessoa;
import com.example.desafiodio.repository.PessoaRepository;
import com.example.desafiodio.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa getById(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.orElse(null);
    }

    @Override
    public Iterable<Pessoa> getAll() {
        return pessoaRepository.findAll();
    }

    @Override
    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    @Override
    public void update(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    @Override
    public void delete(Long id) {
        pessoaRepository.deleteById(id);
    }


}
