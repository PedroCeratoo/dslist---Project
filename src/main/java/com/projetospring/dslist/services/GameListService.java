package com.projetospring.dslist.services;


import com.projetospring.dslist.dto.GameDTO;
import com.projetospring.dslist.dto.GameListDTO;
import com.projetospring.dslist.dto.GameMinDTO;
import com.projetospring.dslist.entities.Game;
import com.projetospring.dslist.entities.GameList;
import com.projetospring.dslist.repositories.GameListRepository;
import com.projetospring.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
