package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.ApplicationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationFormRepository  extends JpaRepository<ApplicationForm, Long> {
}
