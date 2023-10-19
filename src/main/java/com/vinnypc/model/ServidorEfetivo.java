package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ServidorEfetivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 20)
    String st_matricula;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSt_matricula() {
        return st_matricula;
    }

    public void setSt_matricula(String st_matricula) {
        this.st_matricula = st_matricula;
    }
}
