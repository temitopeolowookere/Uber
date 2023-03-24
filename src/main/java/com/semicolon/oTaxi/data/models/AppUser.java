package com.semicolon.oTaxi.data.models;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Builder
@MappedSuperclass

public class AppUser {
    private String lastName;
    private String FirstName;
    private String email;
    private String phoneNumber;
    private String address;
    private String Gender;
}
