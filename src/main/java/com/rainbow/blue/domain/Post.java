package com.rainbow.blue.domain;

import com.rainbow.blue.dto.request.PostSaveRequestDto;
import com.rainbow.blue.dto.request.PostUpdateRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@AllArgsConstructor
public class Post {
    Long id;
    String title;
    String content;
    String writer;
    Timestamp createdAt;

    public static Post of(PostSaveRequestDto postRequestDto) {
        return new Post(postRequestDto.getId(),
                postRequestDto.getTitle(),
                postRequestDto.getContent(),
                postRequestDto.getWriter(),
                new Timestamp(System.currentTimeMillis()));
    }

    public static Post of(Long postId, PostUpdateRequestDto postRequestDto) {
        return new Post(postId,
                postRequestDto.getContent(),
                postRequestDto.getTitle(),
                postRequestDto.getWriter(),
                new Timestamp(System.currentTimeMillis()));
    }
}
