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
    public List<TaskDto> getTasks(final Integer userId) {
        System.out.println("TasksQueryDataSourceImpl");
        System.out.println("tasksMapper is null? " + (tasksMapper == null)); // デバッグ出力

        return tasksMapper.getTasks(userId);
    }
}

