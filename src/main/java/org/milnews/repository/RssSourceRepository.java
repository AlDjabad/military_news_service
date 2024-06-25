package org.milnews.repository;

import org.milnews.entity.RssSource;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RssSourceRepository extends CrudRepository<RssSource, Integer> {
    List<RssSource> findAll();
    Optional<RssSource> findById(Integer id);
}
