package com.semicolon.oTaxi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class LoginRiderRequest {
    @NotBlank(message = " email is required")
    private String email;

    @NotBlank(message = "password is required")
    private String password;
}
