package com.service.ms.student.student.app.domain.ports.in;

import com.service.ms.student.student.app.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {

    AdditionalTaskInfo getAdditionalTaskInfo(Long id);
}
