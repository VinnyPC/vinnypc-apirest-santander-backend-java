package com.vinnypc.repository;

import com.vinnypc.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    boolean existsById(Integer id);

}
