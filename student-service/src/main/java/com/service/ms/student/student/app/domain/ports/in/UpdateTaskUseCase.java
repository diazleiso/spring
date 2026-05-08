package com.service.ms.student.student.app.domain.ports.in;

import com.service.ms.student.student.app.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id,Task updateTask);
}
