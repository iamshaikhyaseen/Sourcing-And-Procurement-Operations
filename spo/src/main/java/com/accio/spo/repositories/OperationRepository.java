package com.accio.spo.repositories;

import com.accio.spo.models.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface OperationRepository extends JpaRepository<Operation, UUID> {
    Optional<Operation> findByOperationName(String name);
}
