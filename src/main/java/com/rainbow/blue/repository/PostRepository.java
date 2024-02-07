package com.rainbow.blue.repository;

import com.rainbow.blue.domain.Post;
import java.util.List;

public interface PostRepository {
    List<Post> AllPosts();

    List<Post> postPages(int pageNum);

    Post getPostById(Long id);

    void deleteById(Long id);

    void save(Post post);

    void update(Post post);
}
