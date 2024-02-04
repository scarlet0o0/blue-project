package com.rainbow.blue.repository;

import com.rainbow.blue.domain.Post;
import java.util.List;

public interface PostRepository {
    List<Post> AllPosts();

    Post getPostById(Long id);

    void deleteById(Long id);

    void save(Post post);

    void update(Post post);
}
