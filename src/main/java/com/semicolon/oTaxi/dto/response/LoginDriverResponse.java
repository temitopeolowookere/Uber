package com.semicolon.oTaxi.dto.response;

import com.semicolon.oTaxi.data.models.enums.Driverstatus;
import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor



public class LoginDriverResponse {
    private String email;
    private String phoneNUmber;
    private String lastName;
    private String location;
    private Driverstatus driverstatus;
    private String message;

}
