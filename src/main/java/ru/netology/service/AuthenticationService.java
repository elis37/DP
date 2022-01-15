package ru.netology.service;

import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ru.netology.dto.request.AuthenticationRQ;
import ru.netology.dto.response.AuthenticationRS;
import ru.netology.jwt.JwtTokenUtil;
import ru.netology.repository.AuthenticationRepository;

@Service
@AllArgsConstructor
public class AuthenticationService {

    private AuthenticationRepository authenticationRepository;
    private AuthenticationManager authenticationManager;
    private JwtTokenUtil jwtTokenUtil;
    private UserService userService;

    public AuthenticationRS login(AuthenticationRQ authenticationRQ) {
        final String username = authenticationRQ.getLogin();
        final String password = authenticationRQ.getPassword();
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        final UserDetails userDetails = userService.loadUserByUsername(username);
        final String token = jwtTokenUtil.generateToken(userDetails);
        authenticationRepository.putTokenAndUsername(token, username);
        return new AuthenticationRS(token);
    }

    public void logout(String authToken) {
        final String token = authToken.substring(7);
        final String username = authenticationRepository.getUsernameByToken(token);
        System.out.println("User " + username + " logout. JWT is disabled.");
        authenticationRepository.removeTokenAndUsernameByToken(token);
    }
}