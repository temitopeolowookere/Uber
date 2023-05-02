package com.semicolon.oTaxi.controllers;

import com.semicolon.oTaxi.dto.request.LoginRiderRequest;
import com.semicolon.oTaxi.dto.request.RegisterRiderRequest;
import com.semicolon.oTaxi.dto.response.ApiResponse;
import com.semicolon.oTaxi.dto.response.LoginRiderResponse;
import com.semicolon.oTaxi.dto.response.RegisterRiderResponse;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import com.semicolon.oTaxi.exceptions.RiderExistsException;
import com.semicolon.oTaxi.services.RiderService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.json.HTTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/Taxi")
public class RiderController {
    @Autowired
    private RiderService riderService;
    @PostMapping("/rider/register")
    public ResponseEntity<?> register(@RequestBody @NotNull @Valid RegisterRiderRequest registerRiderRequest) throws MismatchedPasswordException, InvalidEmailException, RiderExistsException {
        riderService.register(registerRiderRequest);
        RegisterRiderResponse dataToBeReturned = RegisterRiderResponse.builder()
                .fullName(registerRiderRequest.getLastName() + " " + registerRiderRequest.getFirstName())
                .gender(registerRiderRequest.getGender())
                .phoneNumber(registerRiderRequest.getPhoneNumber())
                .build();
        ApiResponse apiResponse = ApiResponse.builder()
                .message("Rider created successfully!")
                .status("success")
                .data(dataToBeReturned)
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/rider/login")
    public ResponseEntity<?> login(@RequestBody @NotNull @Valid LoginRiderRequest loginRiderRequest) throws RiderExistsException {
        LoginRiderResponse rider = riderService.login(loginRiderRequest);
        ApiResponse apiResponse = ApiResponse.builder()
                .message("login successful!")
                .status("success")
                .data(rider)
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }
}
