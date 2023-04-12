package com.semicolon.oTaxi.services;


import com.semicolon.oTaxi.data.models.Rider;
import com.semicolon.oTaxi.dto.request.LoginRiderRequest;
import com.semicolon.oTaxi.dto.request.RegisterRiderRequest;
import com.semicolon.oTaxi.dto.response.LoginRiderResponse;
import com.semicolon.oTaxi.dto.response.RegisterRiderResponse;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import com.semicolon.oTaxi.exceptions.RiderExistsException;

public interface RiderService {
    RegisterRiderResponse register(RegisterRiderRequest registerRiderRequest) throws InvalidEmailException, RiderExistsException, MismatchedPasswordException;

    LoginRiderResponse login(LoginRiderRequest loginRiderRequest) throws RiderExistsException;

}

