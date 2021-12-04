package com.example.springjwt.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Jwtrequest {
    private String username;
    private String password;
}
