package com.spr.application.usecase;

import com.spr.application.dto.TaskDto;
import com.spr.infrastructure.query.TasksQueryDataSource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GetTasksUseCase {
    final TasksQueryDataSource tasksQueryDataSource;

    public Optional<TaskDto> execute(Integer taskId) {
        final var task = tasksQueryDataSource.getTask(taskId);
        return task;
    }
}
