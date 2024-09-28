package com.padabied.dc_rest.model.dto.responses;

import lombok.Data;

@Data
public class UserResponseTo {
    private Long id;
    private String login;
    private String firstname;
    private String lastname;
}
