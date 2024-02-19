package com.rainbow.blue.dto.response;

import com.rainbow.blue.domain.Post;
import java.sql.Timestamp;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponseDto {
    public Long id;
    public String content;
    public String writer;
    public Timestamp createdAt;
    public String title;
    public String author;
    public String publisher;
    public String status;


    public static PostResponseDto from(Post post) {
        return PostResponseDto.builder()
                .id(post.getId())
                .content(post.getContent())
                .writer(post.getWriter())
                .createdAt(post.getCreatedAt())
                .title(post.getBook().getTitle())
                .author(post.getBook().getAuthor())
                .publisher(post.getBook().getPublisher())
                .status(post.getReadingStatus().getStatus())
                .build();
    }
}
