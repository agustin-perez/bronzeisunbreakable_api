package com.bronzeisunbreakable.api.model.pages.changelog.card;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ChangelogCardMedia {
    @Id
    private long id;
    private long id_card;
    private String url;

    public ChangelogCardMedia(){

    }

    public ChangelogCardMedia(long id, long id_card, String url) {
        this.id = id;
        this.id_card = id_card;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public long getId_card() {
        return id_card;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "ChangelogCardMedia{" +
                "id=" + id +
                ", id_card=" + id_card +
                ", url='" + url + '\'' +
                '}';
    }
}
