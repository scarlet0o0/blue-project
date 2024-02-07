package com.rainbow.blue.dto.response;

import com.rainbow.blue.domain.Post;
import lombok.Builder;
import lombok.Getter;

import java.sql.Timestamp;

@Getter
@Builder
public class PostResponseDto {
    public Long id;
    public String title;
    public String content;
    public String writer;
    public Timestamp createdAt;

    public static PostResponseDto from(Post post) {
        return PostResponseDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .writer(post.getWriter())
                .createdAt(post.getCreatedAt())
                .build();
    }
}
