package com.tabd.congress.mapper;

import com.tabd.congress.dto.ArtigoDTO;
import com.tabd.congress.entities.Artigo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class ArtigoMapper {

    public static ArtigoDTO toDTO(Artigo artigo) {
        ArtigoDTO dto = new ArtigoDTO();
        dto.setId(artigo.getId());
        dto.setTitulo(artigo.getTitulo());
        dto.setResumo(artigo.getResumo());
        dto.setArquivoPDF(artigo.getArquivoPDF());
        if (artigo.getDataSubmissao() != null) {
            dto.setDataSubmissao(artigo.getDataSubmissao().toString());
        }
        //dto.setAutorId(artigo.getAutor().getId());
        //dto.setEmailsAutores(artigo.getEmailsAutores());
        return dto;
    }

    public static Artigo toEntity(ArtigoDTO dto) {
        Artigo artigo = new Artigo();
        artigo.setId(dto.getId());
        artigo.setTitulo(dto.getTitulo());
        artigo.setResumo(dto.getResumo());
        artigo.setArquivoPDF(dto.getArquivoPDF());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if (dto.getDataSubmissao() != null && !dto.getDataSubmissao().isEmpty()) {
            artigo.setDataSubmissao(LocalDate.parse(dto.getDataSubmissao(), formatter));
        }
        //artigo.setDataSubmissao(LocalDate.parse(dto.getDataSubmissao()));
        //artigo.setAutor(new Participante(dto.getAutorId()));
        //artigo.setEmailsAutores(dto.getEmailsAutores());
        return artigo;
    }
}
