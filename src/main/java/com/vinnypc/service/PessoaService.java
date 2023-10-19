package com.vinnypc.service;

import com.vinnypc.model.Pessoa;

public interface PessoaService  {

    Pessoa findById(Integer id);
    Pessoa create(Pessoa usuarioParaCriar);

}
