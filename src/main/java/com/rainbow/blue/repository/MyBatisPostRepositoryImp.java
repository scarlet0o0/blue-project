package com.rainbow.blue.repository;

import com.rainbow.blue.domain.Post;
import com.rainbow.blue.repository.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class MyBatisPostRepositoryImp implements PostRepository{
    private final PostMapper postMapper;

    @Override
    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }

    @Override
    public List<Post> getPostPages(int pageNum) {
        return postMapper.getPostPages(pageNum);
    }

    @Override
    public Post getPostById(Long id) {
        return postMapper.getPostById(id);
    }

    @Override
    public void deleteById(Long id) {
        postMapper.deleteById(id);
    }

    @Override
    public void save(Post post) {
        postMapper.save(post);
    }

    @Override
    public void update(Post post) {
        postMapper.update(post);
    }
}
