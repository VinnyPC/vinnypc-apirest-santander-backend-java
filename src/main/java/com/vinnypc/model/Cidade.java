package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cid_id;
    @Column(length = 200)
    String cid_nome;
    @Column(length = 2)
    Character cid_uf;

    @OneToMany(mappedBy = "cidade")
    private List<Endereco> enderecosList;

    public int getCid_id() {
        return cid_id;
    }

    public void setCid_id(int cid_id) {
        this.cid_id = cid_id;
    }

    public String getCid_nome() {
        return cid_nome;
    }

    public void setCid_nome(String cid_nome) {
        this.cid_nome = cid_nome;
    }

    public Character getCid_uf() {
        return cid_uf;
    }

    public void setCid_uf(Character cid_uf) {
        this.cid_uf = cid_uf;
    }
}
