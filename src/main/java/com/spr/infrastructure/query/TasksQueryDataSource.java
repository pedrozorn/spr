package com.spr.infrastructure.query;

import com.spr.application.dto.TaskDto;

import java.util.Optional;

public interface TasksQueryDataSource {
    Optional<TaskDto> getTask(Integer taskId);
}
