package com.service.ms.student.student.app.application.usecases;

import com.service.ms.student.student.app.domain.models.Task;
import com.service.ms.student.student.app.domain.ports.in.RetrieveTaskUseCase;
import com.service.ms.student.student.app.domain.ports.out.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getTasks() {
        return taskRepositoryPort.findAll();
    }
}
