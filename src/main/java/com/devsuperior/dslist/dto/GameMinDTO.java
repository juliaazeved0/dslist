package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public class GameMinDTO {


    private Long id;
    private String title;
    private Integer year;
    private String shortDescription;
    private String imgUrl;

    public GameMinDTO(){
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.year = entity.getYear();
        this.title = entity.getTitle();
    }

    public GameMinDTO(GameMinProjection projection) {
        this.id = projection.getId();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
        this.year = projection.getYear();
        this.title = projection.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
}
