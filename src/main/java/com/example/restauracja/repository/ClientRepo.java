package com.example.restauracja.repository;

import com.example.restauracja.web.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
