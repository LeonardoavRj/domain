package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long> {

}
