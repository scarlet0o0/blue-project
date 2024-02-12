package com.rainbow.blue.repository.mapper;

import com.rainbow.blue.domain.Post;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper{

    List<Post> getAllPosts();

    List<Post> getPostPages(int pageNum);

    Post getPostById(Long id);

    void deleteById(Long id);

    void save(Post post);

    void update(Post post);
}
