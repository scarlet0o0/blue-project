package com.rainbow.blue.service;

import com.rainbow.blue.domain.Post;
import com.rainbow.blue.dto.request.PostRequestDto;
import com.rainbow.blue.dto.response.PostResponseDto;
import com.rainbow.blue.dto.request.PostUpdateRequestDto;
import com.rainbow.blue.repository.PostRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService{
    private final PostRepository postRepository;

    public void savePost(PostRequestDto postDto) {
        postRepository.save(Post.of(postDto));
    }

    public PostResponseDto getPost(Long id) {
        Post post = postRepository.getPostById(id);
        return PostResponseDto.from(post);
    }

    public List<PostResponseDto> getAllPosts() {
        List<Post> posts = postRepository.AllPosts();
        return posts.stream().map(PostResponseDto::from).toList();
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public void updatePost(Long postId, PostUpdateRequestDto postDto) {
        postRepository.update(Post.of(postId, postDto));
    }
}
