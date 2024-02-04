package com.rainbow.blue.domain;

import com.rainbow.blue.dto.PostRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Post {
    Long id;
    String content;
    String writer;

    public static Post of(PostRequestDto postRequestDto) {
        return new Post(postRequestDto.id, postRequestDto.getContent(), postRequestDto.getWriter());
    }
}
