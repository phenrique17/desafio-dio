package com.example.desafiodio.service;

import com.example.desafiodio.model.Pessoa;

public interface PessoaService {
    /**
     * Serviço responsável por buscar pessoa pelo id.
     * @param id
     * @return Pessoa
     */
    Pessoa getById(Long id);

    /**
     * Serviço responsável por buscar todas as pessoa cadastradas.
     * @return Iterable<Pessoa>
     */
    Iterable<Pessoa> getAll();

    /**
     * Serviço responsável por cadatrar uma nova pessoa.
     * @param pessoa
     */
    void save(Pessoa pessoa);

    /**
     * Serviço responsável por atualizar uma pessoa.
     * @param pessoa
     */
    void update(Pessoa pessoa);

    /**
     * Serviço responsável por deletar uma pessoa.
     * @param id
     */
    void delete(Long id);

}
