package com.gmail.vijay.ecommerce.service;

import com.gmail.vijay.ecommerce.domain.Order;
import com.gmail.vijay.ecommerce.domain.Perfume;
import com.gmail.vijay.ecommerce.domain.User;
import com.gmail.vijay.ecommerce.dto.request.OrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    Order getOrder(Long orderId);

    List<Perfume> getOrdering();

    Page<Order> getUserOrdersList(Pageable pageable);

    Long postOrder(User user, OrderRequest orderRequest);
}
