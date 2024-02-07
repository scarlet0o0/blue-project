package com.rainbow.blue.domain;

import com.rainbow.blue.dto.request.PostSaveRequestDto;
import com.rainbow.blue.dto.request.PostUpdateRequestDto;
import lombok.*;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    Long id;
    String title;
    String content;
    String writer;
    Timestamp createdAt;

    @Builder
    private Post(Long id, String title, String content, String writer, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.createdAt = createdAt;
    }

    public static Post of(PostSaveRequestDto postRequestDto) {
        return Post.builder()
                .title(postRequestDto.getTitle())
                .content(postRequestDto.getContent())
                .writer(postRequestDto.getWriter())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
    }

    public static Post of(Long postId, PostUpdateRequestDto postRequestDto) {
        return Post.builder()
                .id(postId)
                .title(postRequestDto.getTitle())
                .content(postRequestDto.getContent())
                .writer(postRequestDto.getWriter())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
