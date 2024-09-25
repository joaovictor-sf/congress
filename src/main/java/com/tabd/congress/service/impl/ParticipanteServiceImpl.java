package com.tabd.congress.service.impl;

import com.tabd.congress.dto.ParticipanteDTO;
import com.tabd.congress.entities.Participante;
import com.tabd.congress.mapper.ParticipanteMapper;
import com.tabd.congress.repositories.ParticipanteRepository;
import com.tabd.congress.service.ParticipanteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Service
@AllArgsConstructor
public class ParticipanteServiceImpl implements ParticipanteService {
    private ParticipanteRepository participanteRepository;

    @Override
    public ParticipanteDTO save(ParticipanteDTO participanteDTO) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataDeValidade = LocalDate.parse(participanteDTO.getDataVencimentoCartao(), formatter);
        Participante participante = ParticipanteMapper.toEntity(participanteDTO);
        participanteRepository.save(participante);
        return ParticipanteMapper.toDTO(participante);
    }
}
