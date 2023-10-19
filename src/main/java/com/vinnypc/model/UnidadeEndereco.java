package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UnidadeEndereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    @JoinColumn(name = "end_id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "unid_id")
    private Unidade unidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
