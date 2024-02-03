package com.rainbow.blue.service;

import com.rainbow.blue.dto.PostDto;
import java.util.List;

public interface PostService {
    PostDto getPost(Long id);
    void savePost();
    List<PostDto> getAllPosts();
    void deletePost(Long id);
    void updatePost();
}
