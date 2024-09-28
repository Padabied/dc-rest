package com.padabied.dc_rest.model.dto.responses;

import lombok.Data;

@Data
public class CommentResponseTo {
    private Long id;
    private String content;
    private Long storyId;
}
