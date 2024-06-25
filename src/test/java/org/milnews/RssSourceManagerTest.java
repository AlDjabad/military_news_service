package org.milnews;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.milnews.entity.RssSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log
class RssSourceManagerTest {

    @Autowired
    private RssSourceManager rssSourceManager;

    @Test
    void getAllRssSources() {
        List<RssSource> rssSources = rssSourceManager.getAllRssSources();
        log.info("data sources: " + rssSources);
        assertNotNull(rssSources);
    }
}