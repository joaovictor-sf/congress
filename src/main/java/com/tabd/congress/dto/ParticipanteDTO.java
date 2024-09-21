package com.tabd.congress.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParticipanteDTO {
    private Long id;
    private String name;
    private String street;
    private String cellphone;
    private String localEmprego;
    private String email;
    private String numeroCartaoDeCredito;
    private String dataDeValidade;
    private String marcaCartao;
    private Boolean isRevisor;
    //private List<Long> artigosId;
}
