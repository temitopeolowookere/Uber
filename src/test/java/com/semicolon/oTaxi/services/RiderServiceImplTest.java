package com.semicolon.oTaxi.services;

import com.semicolon.oTaxi.exceptions.MismatchedPasswordException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class RiderServiceImplTest {
    @Autowired
    private RiderService riderService;
    @Test
    public void TestThatRiderCanRegister()throws MismatchedPasswordException {

    }


}