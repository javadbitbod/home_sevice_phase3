package org.example.service;

import org.example.dto.ScoreDTO;

import java.util.List;

public interface ScoreService {

    void save(ScoreDTO scoreDTO);

    void delete(ScoreDTO scoreDTO);

    ScoreDTO findById(Long id);

    List<ScoreDTO> findAll();
}
