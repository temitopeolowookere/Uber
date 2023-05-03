package com.semicolon.oTaxi.dto.request;

import com.semicolon.oTaxi.data.models.Driver;
import com.semicolon.oTaxi.data.models.enums.Driverstatus;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class LoginDriverRequest {
    private String email;
    private String password;
    private String location;
}
