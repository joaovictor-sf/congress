package com.tabd.congress.controller;

import com.tabd.congress.dto.ParticipanteDTO;
import com.tabd.congress.repositories.ParticipanteRepository;
import com.tabd.congress.service.impl.ParticipanteServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/participante")
public class ParticipanteController {
    private final ParticipanteServiceImpl participanteService;

    @PostMapping
    public ResponseEntity<ParticipanteDTO> save(@RequestBody ParticipanteDTO participanteDTO) {
        return ResponseEntity.ok(participanteService.save(participanteDTO));
    }
}
