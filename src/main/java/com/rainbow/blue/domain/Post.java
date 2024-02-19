package com.rainbow.blue.domain;

import com.rainbow.blue.dto.request.PostRequestDto;
import com.rainbow.blue.dto.request.PostSaveRequestDto;
import java.sql.Timestamp;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post {
    private Long id;
    private String content;
    private String writer;
    private VisibilityFlag visibilityFlag;
    private Timestamp createdAt;
    private Book book;
    private ReadingStatus readingStatus;

    @Builder
    public Post(Long id, String content, String writer, VisibilityFlag visibilityFlag,
            Timestamp createdAt, Book book, ReadingStatus readingStatus) {
        this.id = id;
        this.content = content;
        this.writer = writer;
        this.visibilityFlag = visibilityFlag;
        this.createdAt = createdAt;
        this.book = book;
        this.readingStatus = readingStatus;
    }

    public static Post of(PostSaveRequestDto postRequestDto) {
        return Post.builder()
                .content(postRequestDto.getContent())
                .writer(postRequestDto.getWriter())
                .visibilityFlag(postRequestDto.getVisibilityFlag())
                .createdAt(new Timestamp(System.currentTimeMillis()))
                .build();
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
