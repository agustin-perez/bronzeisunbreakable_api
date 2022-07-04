package com.bronzeisunbreakable.api.model.pages;

import javax.persistence.*;
import java.lang.String;

@Entity
public class Changelog {
    @Id
    private long id;
    private String title;
    private String body;
    private int severity;

    public Changelog() {

    }

    public Changelog(long id, String title, String body, int severity) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.severity = severity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Changelog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", severity=" + severity +
                '}';
    }
}
