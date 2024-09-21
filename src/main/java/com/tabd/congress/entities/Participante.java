package com.tabd.congress.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "participantes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String cellphone;
    private String localEmprego;
    private String email;
    private String numeroCartaoDeCredito;
    private Date dataDeValidade;
    private String marcaCartao;
    private Boolean isRevisor;

    @OneToMany(mappedBy = "autor")
    private List<Artigo> artigos;

}
