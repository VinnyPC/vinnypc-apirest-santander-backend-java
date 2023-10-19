package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int unid_id;
    @Column(length = 200)
    String unid_nome;
    @Column(length = 20)
    String unid_sigla;

    @OneToMany(mappedBy = "unidade")
    private List<UnidadeEndereco> unidadeEnderecoList;
    @OneToMany(mappedBy = "unidade")
    private List<Lotacao> lotacaoList;

    public int getUnid_id() {
        return unid_id;
    }

    public void setUnid_id(int unid_id) {
        this.unid_id = unid_id;
    }

    public String getUnid_nome() {
        return unid_nome;
    }

    public void setUnid_nome(String unid_nome) {
        this.unid_nome = unid_nome;
    }

    public String getUnid_sigla() {
        return unid_sigla;
    }

    public void setUnid_sigla(String unid_sigla) {
        this.unid_sigla = unid_sigla;
    }
}
