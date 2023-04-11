package com.semicolon.oTaxi.dto.response;

import com.semicolon.oTaxi.data.models.enums.Gender;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRiderResponse {
    private String fullName;
    private Gender gender;
    private String phoneNumber;
    private String message;
}
