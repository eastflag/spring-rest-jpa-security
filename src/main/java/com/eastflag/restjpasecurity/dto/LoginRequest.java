package com.eastflag.restjpasecurity.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private Long id;
    private String username;
    private String email;
    private String password;
}
