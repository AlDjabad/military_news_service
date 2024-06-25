package org.milnews;

import org.milnews.entity.RssSource;
import org.milnews.repository.RssSourceRepository;
import org.milnews.rss.RssChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsRestController {

    @Autowired
    private RssSourceManager rssSourceManager;
    @Autowired
    private RssFeedLoader rssFeedLoader;
    @Autowired
    private RssSourceRepository rssSourceRepository;

    @GetMapping(path = "sources")
    public List<RssSource> getAllRssSources() {
        return rssSourceManager.getAllRssSources();
    }

    @GetMapping(path = "feed/{sourceId}")
    public RssChannel printFeed(@PathVariable String sourceId) {
        RssSource rssSource = rssSourceRepository.findById(Integer.parseInt(sourceId)).get();
        return rssFeedLoader.loadRssFromSource(rssSource).getChannel();
    }

}
