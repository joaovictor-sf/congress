package com.tabd.congress.controller;

import com.tabd.congress.dto.ArtigoDTO;
import com.tabd.congress.service.impl.ArtigoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/artigo")
public class ArtigoController {
    private final ArtigoServiceImpl artigoService;

    @PostMapping
    public ResponseEntity<ArtigoDTO> save(@RequestBody ArtigoDTO artigoDTO) {
        return ResponseEntity.ok(artigoService.save(artigoDTO));
    }
}
