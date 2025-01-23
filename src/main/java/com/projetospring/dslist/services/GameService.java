package com.projetospring.dslist.services;


import com.projetospring.dslist.dto.GameDTO;
import com.projetospring.dslist.dto.GameMinDTO;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
}
