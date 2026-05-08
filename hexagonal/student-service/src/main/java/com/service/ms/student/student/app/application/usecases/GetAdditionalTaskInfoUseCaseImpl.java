package com.service.ms.student.student.app.application.usecases;

import com.service.ms.student.student.app.domain.models.AdditionalTaskInfo;
import com.service.ms.student.student.app.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.service.ms.student.student.app.domain.ports.out.ExternalServicePort;

public class GetAdditionalTaskInfoUseCaseImpl implements GetAdditionalTaskInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }


    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getAdditionalTaskInfo(id);
    }
}
