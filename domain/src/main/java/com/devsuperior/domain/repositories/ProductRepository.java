package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.domain.entities.Client;
import com.devsuperior.domain.entities.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {

}
