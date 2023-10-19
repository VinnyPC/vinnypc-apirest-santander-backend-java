package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int pes_id;
    @Column(length = 200)
    String pes_nome;
    Date pes_data_nascimento;
    @Column(length = 9)
    String pes_sexo;
    @Column(length = 200)
    String pes_mae;
    @Column(length = 200)
    String pes_pai;

    @OneToMany(mappedBy = "pessoa")
    private List<PessoaEndereco> pessoaEnderecoList;

    @OneToMany(mappedBy = "pessoa")
    private List<FotoPessoa> fotoPessoaList;

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public Date getPes_data_nascimento() {
        return pes_data_nascimento;
    }

    public void setPes_data_nascimento(Date pes_data_nascimento) {
        this.pes_data_nascimento = pes_data_nascimento;
    }

    public String getPes_sexo() {
        return pes_sexo;
    }

    public void setPes_sexo(String pes_sexo) {
        this.pes_sexo = pes_sexo;
    }

    public String getPes_mae() {
        return pes_mae;
    }

    public void setPes_mae(String pes_mae) {
        this.pes_mae = pes_mae;
    }

    public String getPes_pai() {
        return pes_pai;
    }

    public void setPes_pai(String pes_pai) {
        this.pes_pai = pes_pai;
    }
}
