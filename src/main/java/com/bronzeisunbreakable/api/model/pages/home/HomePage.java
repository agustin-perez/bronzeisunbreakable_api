package com.bronzeisunbreakable.api.model.pages.home;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HomePage {
    @Id
    private long id;
    private String maintitle;
    private String subtitle;
    private String body;

    public HomePage(){

    }

    public HomePage(long id, String maintitle, String subtitle, String body) {
       this.id = id;
       this.maintitle = maintitle;
       this.subtitle = subtitle;
       this.body = body;
    }

    public long getId() {
        return id;
    }

    public String getMaintitle() {
        return maintitle;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Home{" +
                "id=" + id +
                ", maintitle='" + maintitle + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
