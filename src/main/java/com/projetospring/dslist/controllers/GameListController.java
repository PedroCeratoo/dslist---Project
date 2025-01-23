package com.projetospring.dslist.controllers;


import com.projetospring.dslist.dto.GameDTO;
import com.projetospring.dslist.dto.GameListDTO;
import com.projetospring.dslist.dto.GameMinDTO;
import com.projetospring.dslist.entities.GameList;
import com.projetospring.dslist.services.GameListService;
import com.projetospring.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();

        return result;
    }
}
