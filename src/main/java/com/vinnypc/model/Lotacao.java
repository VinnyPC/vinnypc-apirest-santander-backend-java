package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Lotacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int lot_id;
    Date lot_data_lotacao;
    Date lot_data_remocao;
    @Column(length = 100)
    String lot_portaria;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "unid_id")
    private Unidade unidade;

    public int getLot_id() {
        return lot_id;
    }

    public void setLot_id(int lot_id) {
        this.lot_id = lot_id;
    }

    public Date getLot_data_lotacao() {
        return lot_data_lotacao;
    }

    public void setLot_data_lotacao(Date lot_data_lotacao) {
        this.lot_data_lotacao = lot_data_lotacao;
    }

    public Date getLot_data_remocao() {
        return lot_data_remocao;
    }

    public void setLot_data_remocao(Date lot_data_remocao) {
        this.lot_data_remocao = lot_data_remocao;
    }

    public String getLot_portaria() {
        return lot_portaria;
    }

    public void setLot_portaria(String lot_portaria) {
        this.lot_portaria = lot_portaria;
    }
}
