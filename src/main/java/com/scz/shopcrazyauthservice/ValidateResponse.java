package com.scz.shopcrazyauthservice;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ValidateResponse {
    private String username;
    private boolean valid;
}
