package com.service.ms.student.student.app.application.usecases;

import com.service.ms.student.student.app.domain.models.Task;
import com.service.ms.student.student.app.domain.ports.in.CreateTaskUseCase;
import com.service.ms.student.student.app.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTassk(Task task) {
        return taskRepositoryPort.save(task);
    }
    // Implementation of the CreateTaskUseCase interface methods

}
