package com.rainbow.blue.service;

import com.rainbow.blue.dto.PostDto;
import com.rainbow.blue.mapper.PostMapper;
import com.rainbow.blue.vo.PostVo;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImp implements PostService{
    private final PostMapper postMapper;

    @Override
    public void savePost() {
    }

    @Override
    public PostDto getPost(Long id) {
        PostVo post = postMapper.getPostById(id);
        return PostDto.from(post);
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<PostVo> postVos = postMapper.AllPosts();
        return postVos.stream().map(PostDto::from).toList();
    }

    @Override
    public void deletePost(Long id) {
        postMapper.deleteById(id);
    }

    @Override
    public void updatePost() {
    }
}
