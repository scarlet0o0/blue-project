package com.rainbow.blue.service;

import com.rainbow.blue.domain.Post;
import com.rainbow.blue.dto.request.PostRequestDto;
import com.rainbow.blue.dto.request.PostSaveRequestDto;
import com.rainbow.blue.dto.response.PostResponseDto;
import com.rainbow.blue.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService{
    private final PostRepository postRepository;

    public void savePost(PostSaveRequestDto postDto) {
        postRepository.save(Post.of(postDto));
    }

    public PostResponseDto getPost(Long id) {
        Post post = postRepository.getPostById(id);
        return PostResponseDto.from(post);
    }

    public List<PostResponseDto> getAllPosts() {
        List<Post> posts = postRepository.getAllPosts();
        return posts.stream().map(PostResponseDto::from).toList();
    }

    public List<PostResponseDto> getPostPages(int pageNum) {
        List<Post> posts = postRepository.getPostPages(pageNum);
        return posts.stream().map(PostResponseDto::from).toList();
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public void updatePost(Long postId, PostRequestDto postDto) {
        postRepository.update(Post.of(postId, postDto));
    }
}
