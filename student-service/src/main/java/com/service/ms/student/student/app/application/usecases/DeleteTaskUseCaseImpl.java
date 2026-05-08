package com.service.ms.student.student.app.application.usecases;

import com.service.ms.student.student.app.domain.ports.in.DeleteTaskUseCase;
import com.service.ms.student.student.app.domain.ports.out.TaskRepositoryPort;

public abstract class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private  final TaskRepositoryPort taskRepositoryPort;

    protected DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteById(Long id) {
        // Default implementation can be provided here if needed
        // or this method can be left abstract to be implemented by subclasses.
        return taskRepositoryPort.deleteById(id);
    }
}
