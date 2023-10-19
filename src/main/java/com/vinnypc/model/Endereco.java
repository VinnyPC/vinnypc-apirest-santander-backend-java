package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int end_id;
    @Column(length = 50)
    String end_tipo_logradouro;
    @Column(length = 200)
    String end_logradouro;
    int end_numero;
    @Column(length = 100)
    String end_bairro;

    @ManyToOne
    @JoinColumn(name = "cid_id")
    private Cidade cidade;

    @OneToMany(mappedBy = "endereco")
    private List<UnidadeEndereco> unidadeEnderecoList;

    @OneToMany(mappedBy = "endereco")
    private List<PessoaEndereco> pessoaEnderecoList;

    public int getEnd_id() {
        return end_id;
    }

    public void setEnd_id(int end_id) {
        this.end_id = end_id;
    }

    public String getEnd_tipo_logradouro() {
        return end_tipo_logradouro;
    }

    public void setEnd_tipo_logradouro(String end_tipo_logradouro) {
        this.end_tipo_logradouro = end_tipo_logradouro;
    }

    public String getEnd_logradouro() {
        return end_logradouro;
    }

    public void setEnd_logradouro(String end_logradouro) {
        this.end_logradouro = end_logradouro;
    }

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        this.end_numero = end_numero;
    }

    public String getEnd_bairro() {
        return end_bairro;
    }

    public void setEnd_bairro(String end_bairro) {
        this.end_bairro = end_bairro;
    }
}
