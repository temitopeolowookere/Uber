package com.semicolon.oTaxi.controllers;


import com.semicolon.oTaxi.dto.request.LoginDriverRequest;
import com.semicolon.oTaxi.dto.request.RegisterDriverRequest;
import com.semicolon.oTaxi.dto.request.RegisterRiderRequest;
import com.semicolon.oTaxi.dto.response.ApiResponse;
import com.semicolon.oTaxi.dto.response.LoginDriverResponse;
import com.semicolon.oTaxi.dto.response.RegisterDriverResponse;
import com.semicolon.oTaxi.exceptions.DriverExistsException;
import com.semicolon.oTaxi.exceptions.InvalidDriverexception;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import com.semicolon.oTaxi.services.DriverService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/taxi/driver")

public class DriverController {
        private final DriverService driverService;
        @Autowired
        public DriverController(DriverService driverService) {this.driverService = driverService;}
        @PostMapping("/register")
    public ResponseEntity<?>createDriver(@RequestBody @NotNull @Valid RegisterDriverRequest registerDriverRequest)throws MismatchedPasswordException, InvalidEmailException, DriverExistsException{
           driverService.register(registerDriverRequest);
            RegisterDriverResponse dataToBeReturned =RegisterDriverResponse.builder()
                    .fullName(registerDriverRequest.getLastName() +" " + registerDriverRequest.getFirstName())
                    .phoneNumber(registerDriverRequest.getPhoneNumber())
                    .message("welcome on board")
                    .build();
            ApiResponse apiResponse = ApiResponse.builder()
                    .message("Driver created sucessfully")
                    .status("success")
                    .data(dataToBeReturned)
                    .build();
            return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);

        }
        @GetMapping("/login")
    public ResponseEntity<?> login(@RequestBody @NotNull @Valid LoginDriverRequest request) throws InvalidDriverexception, DriverExistsException {
            LoginDriverResponse driver = driverService.login(request);
        ApiResponse apiResponse = ApiResponse.builder()
                .message("login successful!")
                .status("success")
                .data(driver)
                .build();
        return new ResponseEntity<>(apiResponse, HttpStatus.ACCEPTED);
    }



}
