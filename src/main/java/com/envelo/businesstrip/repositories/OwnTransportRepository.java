package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.OwnTransport;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OwnTransportRepository extends JpaRepository<OwnTransport, Long> {
}
