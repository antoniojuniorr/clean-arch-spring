package io.github.antoniojuniorr.cleanarchspring.infra.persistence.repository;


import io.github.antoniojuniorr.cleanarchspring.infra.persistence.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
