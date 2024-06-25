package org.milnews;

import org.milnews.entity.RssSource;
import org.milnews.repository.RssSourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RssSourceManager {
    @Autowired
    private RssSourceRepository repository;
    public List<RssSource> getAllRssSources() {
        return repository.findAll();
    }

}
