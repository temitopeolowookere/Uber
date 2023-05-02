package com.semicolon.oTaxi.dto.response;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RegisterDriverResponse {
    private String fullName;
    private String message;

    private String phoneNumber;
    private String gender;

}
