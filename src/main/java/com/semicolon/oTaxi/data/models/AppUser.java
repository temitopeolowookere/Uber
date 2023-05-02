package com.semicolon.oTaxi.data.models;

import com.semicolon.oTaxi.data.models.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.validation.annotation.Validated;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Builder
@MappedSuperclass

public class AppUser {
    private String name;
    private String lastName;
    private String firstName;
    @Column(unique = true)
    @Email
    @Valid
    private String email;
    private String phoneNumber;
    private String address;
    @Enumerated(value = EnumType.STRING)
    private Gender Gender;
    @Size(message = "password can not be less than 8 characters", min = 6)
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",
            message = "Invalid Password pattern.Password must contain 8 to 20 characters at least one digit, lower, upper case and one special character."
    )
    private String password;
}
