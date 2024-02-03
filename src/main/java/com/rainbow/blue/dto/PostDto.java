package com.rainbow.blue.dto;

import com.rainbow.blue.vo.PostVo;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostDto {
    public String content;
    public String writer;

    public static PostDto from(PostVo postVo) {
        return PostDto.builder()
                .content(postVo.getContent())
                .writer(postVo.getWriter())
                .build();
    }

}
