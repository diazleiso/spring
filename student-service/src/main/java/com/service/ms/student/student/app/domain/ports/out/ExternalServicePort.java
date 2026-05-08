package com.service.ms.student.student.app.domain.ports.out;

import com.service.ms.student.student.app.domain.models.AdditionalTaskInfo;

public interface ExternalServicePort {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
