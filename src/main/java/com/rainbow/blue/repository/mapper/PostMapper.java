package com.rainbow.blue.repository.mapper;

import com.rainbow.blue.domain.Post;
import com.rainbow.blue.repository.PostRepository;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper extends PostRepository {

    @Override
    List<Post> AllPosts();

    @Override
    List<Post> postPages(int pageNum);

    @Override
    Post getPostById(Long id);

    @Override
    void deleteById(Long id);

    @Override
    void save(Post post);

    @Override
    void update(Post post);
}
