package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.OwnTransportType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnTransportTypeRepository extends JpaRepository<OwnTransportType, Long> {
}
