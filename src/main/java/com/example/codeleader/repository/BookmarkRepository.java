package com.example.codeleader.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.codeleader.entity.Bookmark;

@Repository
public interface BookmarkRepository extends CrudRepository<Bookmark, Long> {
    
}
