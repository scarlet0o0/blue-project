package com.rainbow.blue.domain;

import com.rainbow.blue.dto.request.PostRequestDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    Long id;
    String content;
    String writer;
    String visibilityFlag;
    Timestamp createdAt;

    @Builder
    private Post(Long id, String content, String writer, String visibilityFlag, Timestamp createdAt) {
        this.id = id;
        this.content = content;
        this.writer = writer;
        this.visibilityFlag = visibilityFlag;
        this.createdAt = createdAt;
    }

    public static Post of(PostRequestDto postRequestDto) {
        return Post.builder()
                .content(postRequestDto.getContent())
                .writer(postRequestDto.getWriter())
                .visibilityFlag(postRequestDto.getVisibilityFlag())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
    }

    public static Post of(Long postId, PostRequestDto postRequestDto) {
        return Post.builder()
                .id(postId)
                .content(postRequestDto.getContent())
                .writer(postRequestDto.getWriter())
                .visibilityFlag(postRequestDto.getVisibilityFlag())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
    }
}
