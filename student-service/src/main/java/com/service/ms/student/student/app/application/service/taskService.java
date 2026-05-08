package com.service.ms.student.student.app.application.service;

import com.service.ms.student.student.app.domain.models.AdditionalTaskInfo;
import com.service.ms.student.student.app.domain.models.Task;
import com.service.ms.student.student.app.domain.ports.in.*;

import java.util.List;
import java.util.Optional;

public class taskService implements CreateTaskUseCase, RetrieveTaskUseCase, UpdateTaskUseCase, DeleteTaskUseCase, GetAdditionalTaskInfoUseCase {

   private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    public taskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase, UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    @Override
    public Task createTassk(Task task) {
        return createTaskUseCase.createTassk(task);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return retrieveTaskUseCase.getTask(id);
    }

    @Override
    public List<Task> getTasks() {
        return retrieveTaskUseCase.getTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
    }




}
