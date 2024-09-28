package com.padabied.dc_rest.model.dto.responses;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StoryResponseTo {
    private Long id;
    private String title;
    private String content;
    private Long userId;
//    private LocalDateTime created;
//    private LocalDateTime modified;
//    private String username;  // Логин пользователя
}
