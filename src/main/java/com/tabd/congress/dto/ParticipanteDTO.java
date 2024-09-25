package com.tabd.congress.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParticipanteDTO {
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String localEmprego;
    private String email;
    private String numeroCartaoCredito;
    private String dataVencimentoCartao;
    private String marcaCartaoCredito;
    private Boolean voluntarioRevisor;
    //private List<Long> artigosId;
}
