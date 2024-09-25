package com.tabd.congress.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "artigo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artigo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //titulo, resumo, arquivo(base64 e armazenar o caminho), data de submissão e emails dos autores
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "resumo")
    private String resumo;
    @Column(name = "arquivopdf")
    private String arquivoPDF;
    @Column(name = "datasubmissao")
    private LocalDate dataSubmissao;

    /*@ManyToOne
    @JoinColumn(name = "autor_id")
    private Participante autor;

    @ElementCollection
    @CollectionTable(name = "emails_autores", joinColumns = @JoinColumn(name = "artigo_id"))
    @Column(name = "email")
    private List<String> emailsAutores;*/

}
