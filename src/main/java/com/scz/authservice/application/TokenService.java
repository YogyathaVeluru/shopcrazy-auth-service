package com.scz.authservice.application;

import com.scz.authservice.domain.model.Token;
import com.scz.authservice.domain.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TokenService {


    @Autowired
    public TokenRepository tokenRepository;

    public Token generateToken(String username) {


        Token token = new Token();
        token.setUsername(username);
        token.setTokenid(new Random().nextInt(1000));
        token.setStatus("valid");

        tokenRepository.save(token);

        return token;
    }

    public boolean validateToken(String token)
    {
        Token token1 = tokenRepository.findById(Integer.parseInt(token)).orElse(null);

        if(token1 == null)
        {
            return false;
        }

        if(token1.getStatus().equals("valid"))
        {
            return true;
        }

        return false;
    }

}
