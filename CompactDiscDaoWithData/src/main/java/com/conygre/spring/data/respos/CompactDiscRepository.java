package com.conygre.spring.data.respos;

import com.conygre.spring.entities.CompactDisc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface CompactDiscRepository extends JpaRepository<CompactDisc, Integer> {

    @Query("SELECT p FROM CompactDisc p WHERE LOWER(p.artist) = LOWER(:artist)")
    public List<CompactDisc> find(@Param("artist") String artist);

}
