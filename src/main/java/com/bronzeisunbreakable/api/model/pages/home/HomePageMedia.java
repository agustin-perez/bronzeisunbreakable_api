package com.bronzeisunbreakable.api.model.pages.home;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HomePageMedia {
    @Id
    private long id;
    private long id_entry;
    private String url;

    public HomePageMedia(){

    }

    public HomePageMedia(long id, long id_entry, String url) {
        this.id = id;
        this.id_entry = id_entry;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public long getId_entry() {
        return id_entry;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "HomePageMedia{" +
                "id=" + id +
                ", id_entry=" + id_entry +
                ", url='" + url + '\'' +
                '}';
    }
}
