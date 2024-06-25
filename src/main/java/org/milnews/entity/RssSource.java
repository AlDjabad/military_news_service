package org.milnews.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class RssSource {
    @Id
    private Integer id;
    @Column(name = "source_name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "rss_url")
    private String url;
    @Column(name = "last_updates")
    private LocalDate lastUpdated;
}
