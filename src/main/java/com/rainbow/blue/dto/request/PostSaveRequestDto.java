package com.rainbow.blue.dto.request;

import lombok.Getter;

@Getter
public class PostSaveRequestDto {
    public Long id;
    public String title;
    public String content;
    public String writer;

}
