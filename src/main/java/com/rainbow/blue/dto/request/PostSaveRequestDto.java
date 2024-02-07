package com.rainbow.blue.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class PostSaveRequestDto {
    @NotBlank(message = "제목이 비어있습니다.")
    public String title;
    @NotBlank(message = "내용이 비어있습니다.")
    public String content;
    @NotBlank(message = "작성자가 비어있습니다.")
    public String writer;

}
