package com.bronzeisunbreakable.api.model.pages.changelog.card;

import javax.persistence.*;
import java.lang.String;

@Entity
public class ChangelogCard {
    @Id
    private long id;
    private String title;
    private String body;
    private int severity;

    public ChangelogCard() {

    }

    public ChangelogCard(long id, String title, String body, int severity) {
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
