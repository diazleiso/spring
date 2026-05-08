package com.service.ms.student.student.app.domain.ports.in;

import com.service.ms.student.student.app.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTassk(Task task);
}
