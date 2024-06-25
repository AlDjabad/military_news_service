package org.milnews.rss;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel")
public class RssChannel {
    @XmlElement(name = "item")
    private List<RssItem> items;
    private String title;
    private String link;
    private String description;
    private String imageUrl;

}
