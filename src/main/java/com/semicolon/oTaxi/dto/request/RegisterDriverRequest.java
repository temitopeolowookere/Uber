package com.semicolon.oTaxi.dto.request;

import com.semicolon.oTaxi.data.models.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterDriverRequest {
    private String lastName;
    private String firstName;
    @Email
    private String email;
    private String address;
    private String phoneNumber;
    @Size(message = "password cannot be less than 6 characters", min = 6)
    private String password;
    private String confirmPassword;
    private Gender gender;
}
