package org.milnews.rss;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item")
public class RssItem {
    private String title;
    private String link;
    private String description;
    private String author;
    private String pubDate;
    private String category;
    @XmlElement(namespace = "http://purl.org/rss/1.0/modules/content/", name = "encoded")
    private String content;
    ;


}
