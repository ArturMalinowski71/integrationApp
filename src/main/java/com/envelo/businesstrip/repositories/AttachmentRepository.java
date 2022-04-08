package com.envelo.businesstrip.repositories;

import com.envelo.businesstrip.model.entities.attachments.BaseAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository<BaseAttachment, Long> {
}
