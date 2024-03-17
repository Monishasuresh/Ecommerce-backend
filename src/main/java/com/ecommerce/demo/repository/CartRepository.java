package com.ecommerce.demo.repository;

import com.ecommerce.demo.model.Cart;
import com.ecommerce.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Integer> {
    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
