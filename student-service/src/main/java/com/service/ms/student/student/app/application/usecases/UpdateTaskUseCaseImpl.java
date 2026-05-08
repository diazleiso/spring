package com.service.ms.student.student.app.application.usecases;

import com.service.ms.student.student.app.domain.models.Task;
import com.service.ms.student.student.app.domain.ports.in.UpdateTaskUseCase;
import com.service.ms.student.student.app.domain.ports.out.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }


    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
