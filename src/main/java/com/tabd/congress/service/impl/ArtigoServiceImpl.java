package com.tabd.congress.service.impl;

import com.tabd.congress.dto.ArtigoDTO;
import com.tabd.congress.entities.Artigo;
import com.tabd.congress.mapper.ArtigoMapper;
import com.tabd.congress.repositories.ArtigoRepository;
import com.tabd.congress.service.ArtigoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class ArtigoServiceImpl implements ArtigoService {

    private ArtigoRepository artigoRepository;

    @Override
    public ArtigoDTO save(ArtigoDTO artigoDTO) {
        Artigo artigo = ArtigoMapper.toEntity(artigoDTO);
        artigoRepository.save(artigo);
        return ArtigoMapper.toDTO(artigo);
    }
}
