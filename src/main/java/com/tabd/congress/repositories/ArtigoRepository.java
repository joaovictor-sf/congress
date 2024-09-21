package com.tabd.congress.repositories;

import com.tabd.congress.entities.Artigo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtigoRepository extends JpaRepository<Artigo, Long> {
}
