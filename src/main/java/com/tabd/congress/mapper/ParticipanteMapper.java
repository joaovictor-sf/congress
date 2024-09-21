package com.tabd.congress.mapper;

import com.tabd.congress.dto.ParticipanteDTO;
import com.tabd.congress.entities.Participante;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class ParticipanteMapper {
    public ParticipanteDTO toDTO(Participante participante) {
        ParticipanteDTO dto = new ParticipanteDTO();
        dto.setId(participante.getId());
        dto.setName(participante.getName());
        dto.setStreet(participante.getStreet());
        dto.setCellphone(participante.getCellphone());
        dto.setLocalEmprego(participante.getLocalEmprego());
        dto.setEmail(participante.getEmail());
        dto.setNumeroCartaoDeCredito(participante.getNumeroCartaoDeCredito());
        dto.setDataDeValidade(participante.getDataDeValidade().toString());
        dto.setMarcaCartao(participante.getMarcaCartao());
        dto.setIsRevisor(participante.getIsRevisor());
        //dto.setArtigosId(participante.getArtigos().stream().map(Artigo::getId).collect(Collectors.toList()));
        return dto;
    }

    public Participante toEntity(ParticipanteDTO dto) {
        Participante participante = new Participante();
        participante.setId(dto.getId());
        participante.setName(dto.getName());
        participante.setStreet(dto.getStreet());
        participante.setCellphone(dto.getCellphone());
        participante.setLocalEmprego(dto.getLocalEmprego());
        participante.setEmail(dto.getEmail());
        participante.setNumeroCartaoDeCredito(dto.getNumeroCartaoDeCredito());
        participante.setDataDeValidade(LocalDate.parse(dto.getDataDeValidade()));
        participante.setMarcaCartao(dto.getMarcaCartao());
        participante.setIsRevisor(dto.getIsRevisor());
        //participante.setArtigos(dto.getArtigosId().stream().map(id -> new Artigo(id)).collect(Collectors.toList()));
        return participante;
    }
}
