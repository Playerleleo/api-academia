package com.academiaApi.academia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanoReposity extends JpaRepository<PlanoReposity, UUID> {
}
