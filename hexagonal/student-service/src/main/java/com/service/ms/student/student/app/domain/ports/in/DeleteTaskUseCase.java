package com.service.ms.student.student.app.domain.ports.in;

public interface DeleteTaskUseCase {
    boolean deleteTask(Long id);

    void deleteTask(String taskId);

    boolean deleteById(Long id);
}
