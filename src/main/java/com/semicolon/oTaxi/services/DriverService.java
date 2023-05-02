package com.semicolon.oTaxi.services;

import com.semicolon.oTaxi.dto.request.LoginDriverRequest;
import com.semicolon.oTaxi.dto.request.LoginRiderRequest;
import com.semicolon.oTaxi.dto.request.RegisterDriverRequest;
import com.semicolon.oTaxi.dto.response.LoginDriverResponse;
import com.semicolon.oTaxi.dto.response.LoginRiderResponse;
import com.semicolon.oTaxi.dto.response.RegisterDriverResponse;
import com.semicolon.oTaxi.exceptions.DriverExistsException;
import com.semicolon.oTaxi.exceptions.InvalidDriverexception;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;

public interface DriverService {
    RegisterDriverResponse register(RegisterDriverRequest registerDriverRequest)throws InvalidEmailException, DriverExistsException, MismatchedPasswordException;

    LoginDriverResponse login(LoginDriverRequest loginDriverRequest) throws DriverExistsException, InvalidDriverexception;
}




