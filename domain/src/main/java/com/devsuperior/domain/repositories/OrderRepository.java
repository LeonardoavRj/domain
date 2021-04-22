package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.domain.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

}
