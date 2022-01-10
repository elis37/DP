package ru.netology.service;

import org.springframework.stereotype.Service;
import ru.netology.dto.request.AuthenticationRQ;
import ru.netology.dto.response.AuthenticationRS;

@Service
public class AuthenticationService {

    public AuthenticationRS login(AuthenticationRQ authenticationRQ) {
        return null;
    }

    public void logout(String authToken) {

    }
}