package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class PessoaEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "end_id")
    private Endereco endereco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
