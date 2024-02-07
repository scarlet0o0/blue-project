package com.rainbow.blue.controller;

import com.rainbow.blue.dto.request.PostSaveRequestDto;
import com.rainbow.blue.dto.response.PostResponseDto;
import com.rainbow.blue.dto.request.PostUpdateRequestDto;
import com.rainbow.blue.service.PostService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping(value = "/post/{postId}")
    public PostResponseDto getPost(@PathVariable Long postId) {
        return postService.getPost(postId);
    }

    @GetMapping(value = "/posts")
    public List<PostResponseDto> getPosts() {
        return postService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void savePost(@RequestBody PostSaveRequestDto postDto) {
        postService.savePost(postDto);
    }

    @PutMapping(value = "/post/{postId}")
    public void updatePost(@PathVariable Long postId, @RequestBody PostUpdateRequestDto postDto) {
        postService.updatePost(postId, postDto);
    }

    @DeleteMapping(value = "/post/{postId}")
    public void deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }

}
