package com.vinnypc.service.impl;

import com.vinnypc.model.Pessoa;
import com.vinnypc.repository.PessoaRepository;
import com.vinnypc.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;



    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public Pessoa findById(Integer id) {
        return pessoaRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Pessoa create(Pessoa pessoa) {
        if(pessoaRepository.existsById(pessoa.getPes_id())){
            throw new IllegalArgumentException("Essa pessoa já está registrada!");
        }
        return pessoaRepository.save(pessoa);
    }
}
