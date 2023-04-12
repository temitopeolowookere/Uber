package com.semicolon.oTaxi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class LoginRiderRequest {
    @NotBlank(message = " email is required")
    private String email;
    private String PhoneNUmber;

    @NotBlank(message = "password is required")
    private String password;
}
