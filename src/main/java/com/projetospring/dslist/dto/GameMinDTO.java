package com.projetospring.dslist.dto;

import com.projetospring.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}