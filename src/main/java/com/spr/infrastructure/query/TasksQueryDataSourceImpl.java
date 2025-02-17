package main.java.com.spr.infrastructure.query;

import lombok.RequiredArgsConstructor;
import main.java.com.spr.application.dto.TaskDto;
import main.java.com.spr.infrastructure.mapper.TasksMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TasksQueryDataSourceImpl implements TasksQueryDataSource {
    private final TasksMapper tasksMapper;

    @Override
    public List<TaskDto> getTasks(final Integer taskId) {
        return tasksMapper.getTasks(taskId);
    }
}

