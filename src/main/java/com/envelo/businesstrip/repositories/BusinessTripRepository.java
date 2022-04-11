package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.BusinessTrip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessTripRepository extends JpaRepository<BusinessTrip, Long> {
}
