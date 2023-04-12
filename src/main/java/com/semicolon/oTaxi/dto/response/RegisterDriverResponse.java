package com.semicolon.oTaxi.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterDriverResponse {
    private String message;
    private String fullName;
    private String phoneNumber;
    private String gender;

}
