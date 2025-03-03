package main.java.com.spr.infrastructure.query;

import main.java.com.spr.application.dto.TaskDto;

import java.util.List;


public interface TasksQueryDataSource {
    List<TaskDto> getTasks(Integer userId);
}
