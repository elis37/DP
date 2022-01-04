package ru.netology.service;

import org.springframework.stereotype.Service;
import ru.netology.model.request.AuthenticationRQ;
import ru.netology.model.response.AuthenticationRS;

@Service
public class AuthenticationService {

    public AuthenticationRS login(AuthenticationRQ authenticationRQ) {
        return null;
    }

    public void logout(String authToken) {

    }
}