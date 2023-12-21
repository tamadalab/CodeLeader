package com.example.codeleader.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.codeleader.entity.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    public List<Post> findAllByOrderByPostedAtDesc();

    public List<Post> findByUserIdOrderByPostedAtDesc(String id);

    public List<Post> findByTitleContaining(String keyWord);

    public List<Post> findByCommentContaining(String keyWord);
}
