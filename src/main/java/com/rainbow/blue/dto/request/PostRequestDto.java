package com.rainbow.blue.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class PostRequestDto {
    @NotBlank(message = "내용이 비어있습니다.")
    public String content;
    @NotBlank(message = "작성자가 비어있습니다.")
    public String writer;
    @NotBlank(message = "공개여부가 비어있습니다.")
    public String visibilityFlag;

}
