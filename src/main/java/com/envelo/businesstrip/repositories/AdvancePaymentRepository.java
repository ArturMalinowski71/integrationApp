package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.AdvancePayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvancePaymentRepository extends JpaRepository<AdvancePayment, Long> {
}
