package com.semicolon.oTaxi.services;

import com.semicolon.oTaxi.data.repositories.DriverRepository;
import com.semicolon.oTaxi.dto.request.RegisterDriverRequest;
import com.semicolon.oTaxi.dto.response.RegisterDriverResponse;
import com.semicolon.oTaxi.exceptions.DriverExistsException;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    DriverRepository driverRepository;

    @Override
    public RegisterDriverResponse register(RegisterDriverRequest registerDriverRequest) throws InvalidEmailException, DriverExistsException, MismatchedPasswordException {
        return null;
    }
}
