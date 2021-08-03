package com.codegym.restaurant.service;


import com.codegym.restaurant.model.Token;

public interface TokenService {

    Token createToken(Token token);

    Token findByToken(String token);
}
