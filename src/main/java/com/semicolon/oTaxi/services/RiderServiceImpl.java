package com.semicolon.oTaxi.services;

import com.semicolon.oTaxi.data.models.Rider;
import com.semicolon.oTaxi.data.repositories.RiderRepository;
import com.semicolon.oTaxi.dto.request.LoginRiderRequest;
import com.semicolon.oTaxi.dto.request.RegisterRiderRequest;
import com.semicolon.oTaxi.dto.response.RegisterRiderResponse;
import com.semicolon.oTaxi.exceptions.InvalidEmailException;
import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import com.semicolon.oTaxi.exceptions.RiderExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.semicolon.oTaxi.utils.ValidateEmail.isvalidEmail;
@Service
public class RiderServiceImpl implements RiderService{
    @Autowired
    private RiderRepository riderRepository;
    @Override
    public RegisterRiderResponse register(RegisterRiderRequest registerRiderRequest) throws InvalidEmailException, RiderExistsException, MismatchedPasswordException {
        if(isvalidEmail(registerRiderRequest.getEmail())){
            if(riderRepository.existsByEmail(registerRiderRequest.getEmail().toLowerCase())) throw new RiderExistsException("This rider already exist");
                Rider rider = new Rider();
                rider.setGender(registerRiderRequest.getGender());
                rider.setAddress(registerRiderRequest.getAddress());
                rider.setFirstName(registerRiderRequest.getFirstName());
                rider.setLastName(registerRiderRequest.getLastName());
                rider.setPhoneNumber(registerRiderRequest.getPhoneNumber());
                rider.setEmail(registerRiderRequest.getEmail().toLowerCase());
                rider.setPassword(registerRiderRequest.getPassword());
                Rider savedRider = riderRepository.save(rider);
                RegisterRiderResponse registerRiderResponse = new RegisterRiderResponse();
                registerRiderResponse.setMessage("Rider " + savedRider.getLastName() + " has been registered successfully!. ");
                return registerRiderResponse;
        } throw new InvalidEmailException("This is an invalid email");
    }

    @Override
    public Rider login(LoginRiderRequest loginRiderRequest) throws RiderExistsException {
        Rider rider = riderRepository.findByEmail(loginRiderRequest.getEmail().toLowerCase());
        if(!riderRepository.existsByEmail(loginRiderRequest.getEmail())) throw new RiderExistsException("this email does not exist");
        if(rider.getPassword().equals(loginRiderRequest.getPassword())){
            return rider;
        }throw new RiderExistsException("Rider not found");
    }


}
