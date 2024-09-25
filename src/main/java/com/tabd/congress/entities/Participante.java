package com.tabd.congress.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "participante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "localemprego")
    private String localEmprego;
    @Column(name = "email")
    private String email;
    @Column(name = "numerocartaocredito")
    private String numeroCartaoCredito;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "datavencimentocartao")
    private LocalDate dataVencimentoCartao;
    @Column(name = "marcacartaocredito")
    private String marcaCartaoCredito;
    @Column(name = "voluntariorevisor")
    private Boolean voluntarioRevisor;

    //@OneToMany(mappedBy = "autor")
    //private List<Artigo> artigos;

}
