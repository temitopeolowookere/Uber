package com.semicolon.oTaxi.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRiderResponse {
    private String email;
    private String phoneNumber;
    private String lastName;
    private String message;
}
