package com.devsuperior.domain.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.domain.entities.Client;

public interface ClientRepository extends JpaRepositoryImplementation<Client, Long> {

}
