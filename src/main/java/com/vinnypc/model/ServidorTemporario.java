package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class ServidorTemporario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date st_data_admissao;
    Date st_data_demissao;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getSt_data_admissao() {
        return st_data_admissao;
    }

    public void setSt_data_admissao(Date st_data_admissao) {
        this.st_data_admissao = st_data_admissao;
    }

    public Date getSt_data_demissao() {
        return st_data_demissao;
    }

    public void setSt_data_demissao(Date st_data_demissao) {
        this.st_data_demissao = st_data_demissao;
    }
}
