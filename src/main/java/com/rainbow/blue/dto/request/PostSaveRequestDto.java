package com.rainbow.blue.dto.request;

import com.rainbow.blue.domain.VisibilityFlag;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class PostSaveRequestDto {
    @NotBlank(message = "내용이 비어있습니다.")
    public String content;
    @NotBlank(message = "작성자가 비어있습니다.")
    public String writer;
    @NotNull(message = "공개여부가 비어있습니다.")
    public VisibilityFlag visibilityFlag;
    @NotNull(message = "책이 비어있습니다.")
    public Long bookId;

}
