package com.vitorino.course.Repositories;

import com.vitorino.course.entities.OrderItem;
import com.vitorino.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}