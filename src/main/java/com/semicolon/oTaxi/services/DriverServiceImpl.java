package com.semicolon.oTaxi.services;

import com.semicolon.oTaxi.data.models.Driver;
import com.semicolon.oTaxi.data.repositories.DriverRepository;
import com.semicolon.oTaxi.dto.request.RegisterDriverRequest;
import com.semicolon.oTaxi.dto.response.RegisterDriverResponse;
import com.semicolon.oTaxi.exceptions.DriverExistsException;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.semicolon.oTaxi.utils.ValidateEmail.isValidEmail;

@Service
public class DriverServiceImpl implements DriverService{

    @Autowired
    DriverRepository driverRepository;

    @Override
    public RegisterDriverResponse register(RegisterDriverRequest registerDriverRequest) throws InvalidEmailException, DriverExistsException, MismatchedPasswordException {
        if (isValidEmail(registerDriverRequest.getEmail())){
            if( driverRepository.existsByEmail(registerDriverRequest.getEmail().toLowerCase()))throw new DriverExistsException("This Driver already exists");
            Driver driver = new Driver();
            driver.setFirstName(registerDriverRequest.getLastName());
            driver.setLastName(registerDriverRequest.getLastName());
            driver.setPhoneNumber(registerDriverRequest.getPhoneNumber());
            driver.setAddress(registerDriverRequest.getAddress());
            driver.setGender(registerDriverRequest.getGender());
            driver.setEmail(registerDriverRequest.getEmail().toLowerCase());
            driver.setPassword(registerDriverRequest.getPassword());
            Driver savedDriver = driverRepository.save(driver);
            RegisterDriverResponse registerDriverResponse = new RegisterDriverResponse();
            registerDriverResponse.setMessage("Driver" + savedDriver.getLastName()+ "has been registered sucessfully");
            return registerDriverResponse;

        }throw new InvalidEmailException("this email is invalid");
    }
}
