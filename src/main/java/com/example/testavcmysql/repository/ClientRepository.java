package com.example.testavcmysql.repository;

import com.example.testavcmysql.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByActive(Boolean active);
    List<Client> findByNameContaining(String name);
}
