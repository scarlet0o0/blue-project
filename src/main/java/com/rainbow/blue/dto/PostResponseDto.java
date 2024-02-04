package com.rainbow.blue.dto;

import com.rainbow.blue.domain.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {
    public Long id;
    public String content;
    public String writer;

    public static PostResponseDto from(Post post) {
        return PostResponseDto.builder()
                .id(post.getId())
                .content(post.getContent())
                .writer(post.getWriter())
                .build();
    }
}
