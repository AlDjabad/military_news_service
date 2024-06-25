package org.milnews;

import lombok.extern.java.Log;
import org.milnews.entity.RssSource;
import org.milnews.rss.Rss;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

@Log
@Component
public class RssFeedLoader {

    public Rss loadRssFromSource(RssSource rssSource) {

        URI rssSourceUri;
        try {
            rssSourceUri = new URI(rssSource.getUrl());
            URL rssSourceUrl = rssSourceUri.toURL();
            JAXBContext context = JAXBContext.newInstance(Rss.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Rss) unmarshaller.unmarshal(rssSourceUrl);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }

}
