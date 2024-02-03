package com.rainbow.blue.controller;

import com.rainbow.blue.dto.PostDto;
import com.rainbow.blue.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping(value = "/post")
    public PostDto getPost() {
        return postService.getPost(1L);
    }

    @GetMapping(value = "/posts")
    public List<PostDto> getPosts() {
        return postService.getAllPosts();
    }

    @DeleteMapping(value = "/post")
    public void deletePost(@RequestParam Long postId) {
        postService.deletePost(postId);
    }

}
