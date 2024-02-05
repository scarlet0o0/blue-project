package com.rainbow.blue.domain;

import com.rainbow.blue.dto.request.PostRequestDto;
import com.rainbow.blue.dto.request.PostUpdateRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
    Long id;
    String content;
    String writer;

    public static Post of(PostRequestDto postRequestDto) {
        return new Post(postRequestDto.getId(), postRequestDto.getContent(), postRequestDto.getWriter());
    }

    public static Post of(Long postId, PostUpdateRequestDto postRequestDto) {
        return new Post(postId, postRequestDto.getContent(), postRequestDto.getWriter());
    }
}
