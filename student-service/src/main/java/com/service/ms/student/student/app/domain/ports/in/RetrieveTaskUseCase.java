package com.service.ms.student.student.app.domain.ports.in;

import com.service.ms.student.student.app.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {

    Optional<Task> getTask(Long id);
    List<Task> getTasks();
}
