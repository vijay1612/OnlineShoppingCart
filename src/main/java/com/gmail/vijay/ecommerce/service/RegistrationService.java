package com.gmail.vijay.ecommerce.service;

import com.gmail.vijay.ecommerce.dto.response.MessageResponse;
import com.gmail.vijay.ecommerce.dto.request.UserRequest;

public interface RegistrationService {

    MessageResponse registration(String captchaResponse, UserRequest user);

    MessageResponse activateEmailCode(String code);
}
