package com.rainbow.blue.controller;

import com.rainbow.blue.dto.PostResponseDto;
import com.rainbow.blue.dto.PostRequestDto;
import com.rainbow.blue.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping(value = "/post")
    public PostResponseDto getPost(@RequestParam Long postId) {
        return postService.getPost(postId);
    }

    @GetMapping(value = "/posts")
    public List<PostResponseDto> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void savePost(@RequestBody PostRequestDto postDto) {
        postService.savePost(postDto);
    }

    @PutMapping(value = "/post")
    public void updatePost(@RequestBody PostRequestDto postDto) {
        postService.updatePost(postDto);
    }

    @DeleteMapping(value = "/post")
    public void deletePost(@RequestParam Long postId) {
        postService.deletePost(postId);
    }

}
