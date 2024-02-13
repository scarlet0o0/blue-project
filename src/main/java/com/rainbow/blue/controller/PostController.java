package com.rainbow.blue.controller;

import com.rainbow.blue.dto.request.PostRequestDto;
import com.rainbow.blue.dto.response.PostResponseDto;
import com.rainbow.blue.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(value = "/post/page")
    public List<PostResponseDto> getPostPages(@RequestParam int pageNum) {
        return postService.getPostPages(pageNum);
    }

    @PostMapping(value = "/post")
    public void savePost(@Valid @RequestBody PostRequestDto postDto) {
        postService.savePost(postDto);
    }

    @PutMapping(value = "/post/{postId}")
    public void updatePost(@PathVariable Long postId, @Valid @RequestBody PostRequestDto postDto) {
        postService.updatePost(postId, postDto);
    }

    @DeleteMapping(value = "/post/{postId}")
    public void deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }

}
