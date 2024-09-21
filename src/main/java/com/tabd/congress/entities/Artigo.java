package com.tabd.congress.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "artigos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Artigo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //titulo, resumo, arquivo(base64 e armazenar o caminho), data de submissão e emails dos autores
    private String titulo;
    private String resumo;
    private String arquivo;
    private String dataSubmissao;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Participante autor;

    @ElementCollection
    @CollectionTable(name = "emails_autores", joinColumns = @JoinColumn(name = "artigo_id"))
    @Column(name = "email")
    private List<String> emailsAutores;

}
