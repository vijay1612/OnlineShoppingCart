package com.gmail.vijay.ecommerce.service;

import com.gmail.vijay.ecommerce.domain.Order;
import com.gmail.vijay.ecommerce.domain.User;
import com.gmail.vijay.ecommerce.dto.request.ChangePasswordRequest;
import com.gmail.vijay.ecommerce.dto.request.EditUserRequest;
import com.gmail.vijay.ecommerce.dto.request.SearchRequest;
import com.gmail.vijay.ecommerce.dto.response.MessageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getAuthenticatedUser();

    Page<Order> searchUserOrders(SearchRequest request, Pageable pageable);

    MessageResponse editUserInfo(EditUserRequest request);

    MessageResponse changePassword(ChangePasswordRequest request);
}
