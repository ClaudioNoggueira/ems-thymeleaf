package com.claudio.emsthymeleaf.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SearchDTO {

    private String id;
    private String search;

    public SearchDTO() {

    }

    public SearchDTO(String id, String search) {
        this.id = id;
        this.search = search;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
