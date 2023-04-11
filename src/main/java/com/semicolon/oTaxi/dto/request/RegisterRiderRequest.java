package com.semicolon.oTaxi.dto.request;

import com.semicolon.oTaxi.data.models.enums.Gender;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRiderRequest {
    private String lastName;
    private String firstName;
    @Email
    private String email;
    private String phoneNumber;
    private String address;
    @Size(message = "password can not be less than 8 characters", min = 6)
    private String password;
    private Gender gender;

}
