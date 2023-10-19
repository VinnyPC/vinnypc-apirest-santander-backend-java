package com.vinnypc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class FotoPessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int fp_id;
    Date fp_data;
    @Column(length = 50)
    String fp_bucket;
    @Column(length = 50)
    String fp_String;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pessoa;

    public int getFp_id() {
        return fp_id;
    }

    public void setFp_id(int fp_id) {
        this.fp_id = fp_id;
    }

    public Date getFp_data() {
        return fp_data;
    }

    public void setFp_data(Date fp_data) {
        this.fp_data = fp_data;
    }

    public String getFp_bucket() {
        return fp_bucket;
    }

    public void setFp_bucket(String fp_bucket) {
        this.fp_bucket = fp_bucket;
    }

    public String getFp_String() {
        return fp_String;
    }

    public void setFp_String(String fp_String) {
        this.fp_String = fp_String;
    }
}
