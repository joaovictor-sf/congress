package com.tabd.congress.mapper;

import com.tabd.congress.dto.ParticipanteDTO;
import com.tabd.congress.entities.Participante;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ParticipanteMapper {
    public static ParticipanteDTO toDTO(Participante participante) {
        ParticipanteDTO dto = new ParticipanteDTO();
        dto.setId(participante.getId());
        dto.setNome(participante.getNome());
        dto.setEndereco(participante.getEndereco());
        dto.setTelefone(participante.getTelefone());
        dto.setLocalEmprego(participante.getLocalEmprego());
        dto.setEmail(participante.getEmail());
        dto.setNumeroCartaoCredito(participante.getNumeroCartaoCredito());
        if (participante.getDataVencimentoCartao() != null) {
            dto.setDataVencimentoCartao(participante.getDataVencimentoCartao().toString());
        }
        dto.setMarcaCartaoCredito(participante.getMarcaCartaoCredito());
        dto.setVoluntarioRevisor(participante.getVoluntarioRevisor());
        //dto.setArtigosId(participante.getArtigos().stream().map(Artigo::getId).collect(Collectors.toList()));
        return dto;
    }

    public static Participante toEntity(ParticipanteDTO dto) {
        Participante participante = new Participante();
        participante.setId(dto.getId());
        participante.setNome(dto.getNome());
        participante.setEndereco(dto.getEndereco());
        participante.setTelefone(dto.getTelefone());
        participante.setLocalEmprego(dto.getLocalEmprego());
        participante.setEmail(dto.getEmail());
        participante.setNumeroCartaoCredito(dto.getNumeroCartaoCredito());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if (dto.getDataVencimentoCartao() != null && !dto.getDataVencimentoCartao().isEmpty()) {
            participante.setDataVencimentoCartao(LocalDate.parse(dto.getDataVencimentoCartao(), formatter));
        }
        participante.setMarcaCartaoCredito(dto.getMarcaCartaoCredito());
        participante.setVoluntarioRevisor(dto.getVoluntarioRevisor());
        //participante.setArtigos(dto.getArtigosId().stream().map(id -> new Artigo(id)).collect(Collectors.toList()));
        return participante;
    }
}
