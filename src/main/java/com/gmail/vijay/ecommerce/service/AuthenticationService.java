package com.gmail.vijay.ecommerce.service;

import com.gmail.vijay.ecommerce.dto.request.PasswordResetRequest;
import com.gmail.vijay.ecommerce.dto.response.MessageResponse;

public interface AuthenticationService {

    MessageResponse sendPasswordResetCode(String email);

    String getEmailByPasswordResetCode(String code);

    MessageResponse resetPassword(PasswordResetRequest request);
}
