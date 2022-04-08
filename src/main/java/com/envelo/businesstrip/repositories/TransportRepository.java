package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransportRepository extends JpaRepository<Transport, Long> {
    Optional<Transport> findTransportByType(String type);
}
