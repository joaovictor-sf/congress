package com.tabd.congress.dto;

import com.tabd.congress.entities.Participante;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArtigoDTO {
    private Long id;
    private String titulo;
    private String resumo;
    private String arquivoPDF;
    private String dataSubmissao;
    //private Long autorId;
    //private List<String> emailsAutores;
}
