package com.semicolon.oTaxi.dto.response;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor



public class LoginDriverResponse {
    private String email;
    private String phoneNUmber;
    private String lastName;
    private String message;

}
