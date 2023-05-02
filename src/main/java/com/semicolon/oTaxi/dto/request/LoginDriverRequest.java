package com.semicolon.oTaxi.dto.request;

import com.semicolon.oTaxi.data.models.enums.Driverstatus;

public class LoginDriverRequest {
    private String email;
    private String password;
    private String location;
    private Driverstatus driverstatus;
}
